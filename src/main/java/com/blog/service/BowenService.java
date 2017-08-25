package com.blog.service;

import com.blog.entity.Bowen;

import java.util.List;

/**
 * Created by 覃玉初 on 2017/6/29.
 */
public interface BowenService {

    boolean bowenSave(Bowen bowen);

    boolean bowenDelete(int bowenId);

    List<Bowen> getAllBowen();

    Bowen getBowen(int bowenId);

    List<Bowen> getRangeBowen(int pages);

    int getBowenQuantity();

    List<Bowen> randomArray(List<Bowen> allBowen);
}
