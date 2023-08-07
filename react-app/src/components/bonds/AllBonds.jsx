import React from 'react';
import BondDetail from './BondDetail';
import { useState, useEffect } from 'react';
import { getAllBonds } from '../../services/BondServices';

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
    if(props.status){
        showBondStatus = props.status;
    }


    return (
        bonds.map(bond => (
            <div className='container' key={bond.id.toString()} >
                <BondDetail info={bond} status={showBondStatus} />
            </div>

        ))

    )
}

export default AllBonds