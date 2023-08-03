import React from 'react'
import BondDetail from './BondDetail'

const AllBonds = () => {
    const bonds = [
    // story 1 data
    { "id": 1, "bond_currency": "USD", "face_value": 1000, "bond_maturity_date": "05/08/2021", "cusip": "", "isin": "XS1988387210" },
    { "id": 2, "bond_currency": "USD", "face_value": 900, "bond_maturity_date": "30/07/2021", "cusip": "123456780", "isin": "USN0280EAR64" },
    { "id": 3, "bond_currency": "USD", "face_value": 900, "bond_maturity_date": "30/09/2021", "cusip": "123456bh0", "isin": "A12356111" },
    // story 2 data
    // shown: 5,6,7,9
    // not shown 4, 8 
    { "id": 4, "bond_currency": "USD", "face_value": 1000, "bond_maturity_date": "26/07/2023", "cusip": "", "isin": "XS1988387210" },
    { "id": 5, "bond_currency": "USD", "face_value": 900, "bond_maturity_date": "27/07/2023", "cusip": "123456780", "isin": "USN0280EAR64" },
    { "id": 6, "bond_currency": "USD", "face_value": 900, "bond_maturity_date": "03/08/2023", "cusip": "123456bh0", "isin": "A12356111" },
    { "id": 7, "bond_currency": "USD", "face_value": 1000, "bond_maturity_date": "10/08/2023", "cusip": "", "isin": "XS1988387210" },
    { "id": 8, "bond_currency": "USD", "face_value": 900, "bond_maturity_date": "11/08/2023", "cusip": "123456780", "isin": "USN0280EAR64" },
    { "id": 9, "bond_currency": "USD", "face_value": 900, "bond_maturity_date": "04/08/2023", "cusip": "123456bh0", "isin": "A12356111" },
    ]



    return (
        bonds.map(bond => (
            <BondDetail info={bond} key={bond.id.toString()} />
        ))

    )
}

export default AllBonds