package id.sinaukoding.latihan.service;

import id.sinaukoding.latihan.model.Brand;
import id.sinaukoding.latihan.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BrandService {
    @Autowired
    private BrandRepository repository;

    @Transactional(readOnly = true)
    public List<Brand> findAll(){
        return repository.findAll();
    }
}