package ru.ahmetdavresh.MyThirdAppForSpringLab.service;

import org.springframework.stereotype.Service;
import ru.ahmetdavresh.MyThirdAppForSpringLab.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
