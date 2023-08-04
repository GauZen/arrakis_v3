import React from 'react'
import { useState,useEffect } from 'react';
import BondDetail from './BondDetail'
import { getAllBonds } from '../../services/BondServices';

const AllBonds = () => {
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

    return (
        bonds.map(bond => (
            <BondDetail info={bond} key={bond.id.toString()} />
        ))

    )
}

export default AllBonds