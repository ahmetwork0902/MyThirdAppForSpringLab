package ru.ahmetdavresh.MyThirdAppForSpringLab.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.ahmetdavresh.MyThirdAppForSpringLab.exception.ValidationFailedException;

@Service
public class RequestValidationService implements ValidationService {
    @Override
    public void isValid(BindingResult bindingResult) throws ValidationFailedException {
        if (bindingResult.hasErrors()) {
            throw new
                    ValidationFailedException(bindingResult.getFieldError().toString());
        }
    }
}
