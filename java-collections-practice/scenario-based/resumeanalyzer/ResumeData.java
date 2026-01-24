package resumeanalyzer;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;


class ResumeData {
    String email;
    String phone;
    int keywordCount;

    ResumeData(String email, String phone, int keywordCount) {
        this.email = email;
        this.phone = phone;
        this.keywordCount = keywordCount;
    }
}

