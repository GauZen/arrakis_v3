import React from 'react';
import BondDetail from './BondDetail';
import { useState, useEffect } from 'react';
import { getAllBonds } from '../../services/BondServices';
import Row from 'react-bootstrap/Row';

const AllBonds = (props) => {
    const [bonds, setBonds] = useState([]);

    useEffect(() => {
        getBondsFromAPI();
    },
        []
    );

    const getBondsFromAPI = () => { }

    getAllBonds().then(res => {
        setBonds(res.data);
    }).catch(err => {
        setBonds([]);
        console.log(err);
    })


    let showBondStatus = false;
    if (props.status) {
        showBondStatus = props.status;
    }


    return (
        <Row>
            {bonds.map(bond => (
                <div className='container' key={bond.id.toString()} >
                    <BondDetail info={bond} status={showBondStatus} parties={props.parties} trades={props.trades} securities={props.securities} />
                </div>

            ))}
        </Row>
    )
}

export default AllBonds