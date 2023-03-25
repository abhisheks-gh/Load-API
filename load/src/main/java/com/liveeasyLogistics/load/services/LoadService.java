package com.liveeasyLogistics.load.services;

import java.util.List;
import java.util.UUID;

import com.liveeasyLogistics.load.entities.Load;

public interface LoadService {
    public List<Load> getAllLoads();

    public Load getLoads(long loadId);

    public List<Load> getLoadsByShipperId(UUID shipperId);

    public Load addLoad(Load load);

    public Load updateLoad(Load load);

    public void deleteLoad(long parseLong);
}
