package br.gov.sp.fatec.springtopicos20231.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springtopicos20231.entity.Medicao;
import br.gov.sp.fatec.springtopicos20231.repository.MedicaoRepository;

@Service
public class MedicaoService implements IMedicaoService {

    @Autowired
    private MedicaoRepository medicaoRepo;

    public Medicao cadastrar(Medicao medicao) {
        return medicaoRepo.save(medicao);
    }

    public List<Medicao> listar() {
        return medicaoRepo.findAll();
    }

    public Medicao buscarPorId(Long id) {
        Optional<Medicao> medicaoOp= medicaoRepo.findById(id);
        if(medicaoOp.isEmpty()){
            throw new IllegalArgumentException("não há medição");
        }
        return medicaoOp.get();
    }
    
}
