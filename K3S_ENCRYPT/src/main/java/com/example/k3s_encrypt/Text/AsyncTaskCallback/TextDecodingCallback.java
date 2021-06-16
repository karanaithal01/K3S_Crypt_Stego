package com.example.k3s_encrypt.Text.AsyncTaskCallback;

import com.example.k3s_encrypt.Text.ImageSteganography;

/**
 * This the callback interface for TextDecoding AsyncTask.
 */

public interface TextDecodingCallback {

    void onStartTextEncoding();

    void onCompleteTextEncoding(ImageSteganography result);

}
