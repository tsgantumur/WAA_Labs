package mum.edu.serviceImpl;

import mum.edu.repository.AdviceRepository;
import mum.edu.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdviceServiceImpl implements AdviceService {

    @Autowired
    AdviceRepository adviceRepository;

    public List<String> getAdvice(String roast) {
        return adviceRepository.getAdvice(roast);
    }
}
