package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Bond;
import com.db.grad.javaapi.repository.BondsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BondHandler implements IBondsSrvice
{
    private BondsRepository itsBondsRepo;

    @Autowired
    public BondHandler(BondsRepository bondsRepo )
    {
        itsBondsRepo = bondsRepo;
    }

    @Override
    public List<Bond> getAllBonds()
    {
        return itsBondsRepo.findAll();
    }

    @Override
    public Bond addBond(Bond theBond)
    {
        return itsBondsRepo.save(theBond);
    }

    @Override
    public long getNoOfBonds()
    {
        return itsBondsRepo.count();
    }

    @Override
    public boolean removeBond(long uniqueId)
    {
        boolean result = false;

        Optional<Bond> theBond = itsBondsRepo.findById(uniqueId);
        if(theBond.isPresent())
        {
            itsBondsRepo.delete(theBond.get());
            result = true;
        }

        return  result;
    }

    @Override
    public Bond getBondsById(long uniqueId)
    {
        return itsBondsRepo.findById(uniqueId).get();
    }

//    @Override
//    public Bond getBondsByISIN(String ISIN )
//    {
//        Bond bondToFind = new Bond();
//        bondToFind.getISIN(ISIN);
//        List<Bond> bonds = itsBondsRepo.findByISIN(bondToFind);
//        Bond result = null;
//
//        if( bonds.size() == 1)
//            result = bonds.get(0);
//
//        return result;
//    }

    @Override
    public Bond updateBondsDetails(Bond bondToUpdate)
    {
        return itsBondsRepo.save(bondToUpdate);
    }


}
