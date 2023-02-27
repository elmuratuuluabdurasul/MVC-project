package peaksoft.service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.model.Hospital;
import peaksoft.repositories.HospitalRepo;
import peaksoft.service.HospitalService;

import java.util.List;
@Service
@RequiredArgsConstructor
public class HospitalServiceImpl implements HospitalService {
    private final HospitalRepo hospitalRepo;
    @Override
    public List<Hospital> findAllHospitals() {
        return hospitalRepo.findAllHospitals();
    }

    @Override
    public void createHospital(Hospital hospital) {
        hospitalRepo.createHospital(hospital);
    }
}
