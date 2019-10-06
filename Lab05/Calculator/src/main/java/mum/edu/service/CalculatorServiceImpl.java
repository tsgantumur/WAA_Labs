package mum.edu.service;

import mum.edu.domain.Calculation;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public void add(Calculation calculation) {
        calculation.setSum(calculation.getAdd1() + calculation.getAdd2());
    }

    @Override
    public void mult(Calculation calculation) {
        calculation.setMult(calculation.getMult1()*calculation.getMult2());
    }
}
