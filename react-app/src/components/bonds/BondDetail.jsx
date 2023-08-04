import React from 'react'

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
    if (businessDayNr <= 6) {
        return (
            <div>
                <p id="blue-alias">ID: {props.info.id}</p>
                <p className="green-class">Face Value: {props.info.face_value}</p>
                <p className="green-class">Trade Currency: {props.info.trade_CURRENCY}</p>
                <p className="green-class">CUSIP: {props.info.cusip}</p>
                <p className="green-class">Bond Maturity Date: {props.info.bond_MATURITY_DATE}</p>

            </div>
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