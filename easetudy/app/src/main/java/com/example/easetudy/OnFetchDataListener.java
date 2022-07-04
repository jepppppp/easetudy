package com.example.easetudy;

import com.example.easetudy.Models.APIResponse;

public interface OnFetchDataListener {
    void onFechData(APIResponse apiResponse, String message);
    void onError(String message);
}
