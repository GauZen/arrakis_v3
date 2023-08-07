import React from 'react';
import Card from 'react-bootstrap/Card';

const BondDetail = (props) => {
    let newDate = new Date();
    let day = newDate.getDate();
    if (day < 10) {
        day = '0' + day;
    }
    let month = newDate.getMonth() + 1;
    if (month < 10) {
        month = '0' + month;
    }
    let year = newDate.getFullYear();
    let currentDate = year + "-" + month + "-" + day;
    let maturityDate = props.info.bond_MATURITY_DATE;
    let maturityDateArray = props.info.bond_MATURITY_DATE.split("-");
    let maturityYear = maturityDateArray[0];
    let maturityMonth = maturityDateArray[1];
    let maturityDay = maturityDateArray[2];
    let startDate = null;
    let endDate = null;
    if (maturityYear >= year && maturityMonth >= month && maturityDay >= day) {
        startDate = currentDate;
        endDate = maturityDate;
    } else {
        startDate = maturityDate;
        endDate = currentDate;
    }


    let businessDayNr = getBusinessDayCount(startDate, endDate);

    let issuerNAME = "not found";
    let bondHOLDER = "not found";
    let bookNAME = "not found";
    

    for(let i=0; i<props.securities.length -1; i++){
        if(props.securities[i].cusip === props.info.cusip){
            issuerNAME = props.securities[i].issuer_NAME;
        }

        if(props.securities[i].cusip === "         "){
            issuerNAME = "BNPParibasIssu 4,37% Microsoft Corp (USD)";
        }
        
    }

    for(let i=0; i< props.parties.length -1 ; i++){
        if(props.parties[i].issuer_NAME === issuerNAME){
            bondHOLDER = props.parties[i].bond_HOLDER;
        }
    }

    for(let i=0; i< props.trades.length -1; i++){
        if(props.trades[i].bond_HOLDER === bondHOLDER){
            bookNAME=props.trades[i].book_NAME;
        }
    }


    if (props.status) {
        if (businessDayNr <= 6) {
            return (
                <Card>
                    <Card.Body>
                        <Card.Title>ID: {props.info.id}</Card.Title>
                        <Card.Text>Face Value: {props.info.face_VALUE}</Card.Text>
                        <Card.Text>Trade Currency: {props.info.trade_CURRENCY}</Card.Text>
                        <Card.Text>CUSIP: {props.info.cusip}</Card.Text>
                        <Card.Text>ISIN: {props.info.isin}</Card.Text>
                        <Card.Text>Issuer Name: {issuerNAME}</Card.Text>
                        <Card.Text>Bond Holder: {bondHOLDER}</Card.Text>
                        <Card.Text>Book Name: {bookNAME}</Card.Text>
                        <Card.Text>Bond Maturity Date: {props.info.bond_MATURITY_DATE}</Card.Text>
                    </Card.Body>
                </Card>
            )
        }
    } else {
        return (
            <Card>
                <Card.Body>
                    <Card.Title>ID: {props.info.id}</Card.Title>
                    <Card.Text>Face Value: {props.info.face_VALUE}</Card.Text>
                    <Card.Text>Trade Currency: {props.info.trade_CURRENCY}</Card.Text>
                    <Card.Text>CUSIP: {props.info.cusip}</Card.Text>
                    <Card.Text>ISIN: {props.info.isin}</Card.Text>
                    <Card.Text>Issuer Name: {issuerNAME}</Card.Text>
                    <Card.Text>Bond Holder: {bondHOLDER}</Card.Text>
                    <Card.Text>Book Name: {bookNAME}</Card.Text>
                    <Card.Text>Bond Maturity Date: {props.info.bond_MATURITY_DATE}</Card.Text>
                </Card.Body>
            </Card>
        )

    }


}

function getBusinessDayCount(startDate, endDate) {
    let current = new Date(startDate);
    let end = new Date(endDate);
    let businessDays = 0;
    while (current <= end) {
        // Check if the current day is not a weekend (Saturday or Sunday)
        if (current.getDay() !== 0 && current.getDay() !== 6) {
            businessDays++;
        }
        // Move to the next day
        current.setDate(current.getDate() + 1);
    }

    return businessDays;
}

export default BondDetail