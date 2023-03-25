package com.liveeasyLogistics.load.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liveeasyLogistics.load.dao.LoadDao;
import com.liveeasyLogistics.load.entities.Load;

// This class is working in the service layer
@Service
public class LoadServiceImpl implements LoadService {
    @Autowired
    private LoadDao loadDao;

    public LoadServiceImpl() { }

    @Override
    public List<Load> getAllLoads() {
        return loadDao.findAll();
    }

    @Override
    public List<Load> getLoadsByShipperId(UUID shipperId) {
    return loadDao.findByShipperId(shipperId);
    }

    @Override
    public Load getLoads(long loadId) {
        return loadDao.getReferenceById(loadId);
    }

    @Override
    public Load addLoad(Load load) {
        loadDao.save(load);
        return load;
    }

    @Override
    public Load updateLoad(Load load) {
        loadDao.save(load);
        return load;
    }

    @Override
    public void deleteLoad(long parseLong) {
        // Loading entity
        Load entity = loadDao.getReferenceById(parseLong);

        loadDao.delete(entity);
    }

}
