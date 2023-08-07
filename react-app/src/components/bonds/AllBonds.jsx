import React from 'react';
import BondDetail from './BondDetail';
/* import { useState, useEffect } from 'react';
import { getAllBonds } from '../../services/BondServices'; */

const AllBonds = (props) => {
    const bonds = [
        {"id":1,"bond_MATURITY_DATE":"2021-08-05","trade_CURRENCY":"USD","cusip":"  ","face_VALUE":1000},
        {"id":2,"bond_MATURITY_DATE":"2021-08-05","trade_CURRENCY":"GBP","cusip":"  ","face_VALUE":1000},
        {"id":3,"bond_MATURITY_DATE":"2021-08-05","trade_CURRENCY":"GBP","cusip":"123456780","face_VALUE":900},
        {"id":4,"bond_MATURITY_DATE":"2021-07-30","trade_CURRENCY":"USD","cusip":"123456780","face_VALUE":900},
        {"id":5,"bond_MATURITY_DATE":"2021-07-30","trade_CURRENCY":"GBP","cusip":"123456bh0","face_VALUE":900},
        {"id":6,"bond_MATURITY_DATE":"2021-09-30","trade_CURRENCY":"USD","cusip":"123456780","face_VALUE":900},
        {"id":7,"bond_MATURITY_DATE":"2021-07-30","trade_CURRENCY":"USD","cusip":"123456bh0","face_VALUE":900},
        {"id":8,"bond_MATURITY_DATE":"2021-08-03","trade_CURRENCY":"GBP","cusip":"AMZN 3.15 08/22/27 REGS","face_VALUE":900},
        {"id":9,"bond_MATURITY_DATE":"2021-08-03","trade_CURRENCY":"USD","cusip":"AMZN 3.15 08/22/27 REGS","face_VALUE":900},
        {"id":10,"bond_MATURITY_DATE":"2021-08-09","trade_CURRENCY":"GBP","cusip":"BDCHBW8","face_VALUE":900},
        {"id":11,"bond_MATURITY_DATE":"2021-08-09","trade_CURRENCY":"GBP","cusip":"BDCHBW8","face_VALUE":900},
        {"id":12,"bond_MATURITY_DATE":"2021-08-09","trade_CURRENCY":"GBP","cusip":"BDCHBW8","face_VALUE":900},
        {"id":13,"bond_MATURITY_DATE":"2021-08-09","trade_CURRENCY":"GBP","cusip":"BDCHBW8","face_VALUE":900},
        {"id":14,"bond_MATURITY_DATE":"2021-08-09","trade_CURRENCY":"GBP","cusip":"BDCHBW8","face_VALUE":900},
        {"id":15,"bond_MATURITY_DATE":"2021-08-09","trade_CURRENCY":"GBP","cusip":"BDCHBW8","face_VALUE":900},
        {"id":16,"bond_MATURITY_DATE":"2021-08-09","trade_CURRENCY":"GBP","cusip":"BDCHBW8","face_VALUE":900},
        {"id":17,"bond_MATURITY_DATE":"2021-08-09","trade_CURRENCY":"GBP","cusip":"BDCHBW8","face_VALUE":900},
        {"id":18,"bond_MATURITY_DATE":"2021-08-09","trade_CURRENCY":"GBP","cusip":"BDCHBW8","face_VALUE":900},
        {"id":19,"bond_MATURITY_DATE":"2021-08-09","trade_CURRENCY":"GBP","cusip":"BDCHBW8","face_VALUE":900},
        {"id":20,"bond_MATURITY_DATE":"2021-08-09","trade_CURRENCY":"GBP","cusip":"BDCHBW8","face_VALUE":690},
        {"id":21,"bond_MATURITY_DATE":"2021-08-06","trade_CURRENCY":"USD","cusip":"87973RAA8","face_VALUE":690},
        {"id":22,"bond_MATURITY_DATE":"2021-08-06","trade_CURRENCY":"USD","cusip":"87973RAA8","face_VALUE":690},
        {"id":23,"bond_MATURITY_DATE":"2021-08-06","trade_CURRENCY":"USD","cusip":"87973RAA8","face_VALUE":690},
        {"id":24,"bond_MATURITY_DATE":"2030-12-22","trade_CURRENCY":"USD","cusip":"87973RAA8","face_VALUE":340},
        {"id":25,"bond_MATURITY_DATE":"2030-12-22","trade_CURRENCY":"USD","cusip":"87973RAA8","face_VALUE":340},
        {"id":26,"bond_MATURITY_DATE":"2030-12-22","trade_CURRENCY":"USD","cusip":"87973RAA8","face_VALUE":340},
        {"id":27,"bond_MATURITY_DATE":"2030-12-22","trade_CURRENCY":"USD","cusip":"87973RAA8","face_VALUE":340},
        {"id":28,"bond_MATURITY_DATE":"2023-07-28","trade_CURRENCY":"USD","cusip":"  ","face_VALUE":1000},
        {"id":29,"bond_MATURITY_DATE":"2023-08-11","trade_CURRENCY":"GBP","cusip":"  ","face_VALUE":1000},
        {"id":30,"bond_MATURITY_DATE":"2023-08-04","trade_CURRENCY":"GBP","cusip":"123456780","face_VALUE":900},
        {"id":31,"bond_MATURITY_DATE":"2023-07-27","trade_CURRENCY":"USD","cusip":"123456780","face_VALUE":900},
        {"id":32,"bond_MATURITY_DATE":"2023-08-14","trade_CURRENCY":"GBP","cusip":"123456bh0","face_VALUE":900}
    ];
    /* const [bonds, setBonds] = useState([]);

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
 */

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