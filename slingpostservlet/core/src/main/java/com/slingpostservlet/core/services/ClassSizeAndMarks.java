package com.slingpostservlet.core.services;

import java.util.List;

public interface ClassSizeAndMarks {
    boolean isClassSizeLimited(List<Student> list);
    int getdesiredMarks();
}