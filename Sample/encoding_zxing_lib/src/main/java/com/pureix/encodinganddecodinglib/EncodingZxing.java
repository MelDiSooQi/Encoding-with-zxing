package com.pureix.encodinganddecodinglib;

import android.graphics.Bitmap;
import android.graphics.Color;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.DataMatrixWriter;
import com.google.zxing.pdf417.PDF417Writer;
import com.google.zxing.qrcode.QRCodeWriter;

/**
 * Created by MWind on 1/17/2017.
 */

public class EncodingZxing
{
    public static Bitmap encodeToPDF417(String text, int width, int dotColor, int backgroundColor){
        int height = 0;
        if(1000 < width) {
            height = (int) (width / 3.8);
        }else
        if(600 < width) {
            height = (int) (width / 3.6);
        }else
        if(500 < width) {
            height = (int) (width / 3.3);
        }else
        if(400 < width) {
            height = (int) (width / 3.1);
        }else
        if(200 < width) {
            height = (int) (width / 3.0);
        }else
        if(100 < width) {
            height = (int) (width / 2.6);
        }else
        {
            height = (int) (width / 1.84);
        }
        PDF417Writer writer = new PDF417Writer();
        BitMatrix matrix = null;
        try {
            matrix = writer.encode(text, BarcodeFormat.PDF_417, width, height);
        } catch (WriterException ex) {
            ex.printStackTrace();
        }
        Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
        for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++){
                bmp.setPixel(x, y, matrix.get(x,y) ? dotColor : backgroundColor);
            }
        }
        return bmp;
    }

    public static Bitmap encodeToPDF417(String text, int width, int height,
                                        int dotColor, int backgroundColor)
    {
        PDF417Writer writer = new PDF417Writer();
        BitMatrix matrix = null;
        try {
            matrix = writer.encode(text, BarcodeFormat.PDF_417, width, height);
        } catch (WriterException ex) {
            ex.printStackTrace();
        }
        Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
        for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++){
                bmp.setPixel(x, y, matrix.get(x,y) ? dotColor : backgroundColor);
            }
        }
        return bmp;
    }

    public static Bitmap encodeToQrCode(String text, int width){
        int height = 0;
        height = width;
        QRCodeWriter writer = new QRCodeWriter();
        BitMatrix matrix = null;
        try {
            matrix = writer.encode(text, BarcodeFormat.QR_CODE, width, height);
        } catch (WriterException ex) {
            ex.printStackTrace();
        }
        Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
        for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++){
                bmp.setPixel(x, y, matrix.get(x,y) ? Color.BLACK : Color.WHITE);
            }
        }
        return bmp;
    }
    public static Bitmap encodeToQrCode(String text, int width, int height){
        QRCodeWriter writer = new QRCodeWriter();
        BitMatrix matrix = null;
        try {
            matrix = writer.encode(text, BarcodeFormat.QR_CODE, 100, 100);
        } catch (WriterException ex) {
            ex.printStackTrace();
        }
        Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
        for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++){
                bmp.setPixel(x, y, matrix.get(x,y) ? Color.BLACK : Color.WHITE);
            }
        }
        return bmp;
    }

    public static Bitmap encodeToDataMatrix(String text, int width, int height){

        DataMatrixWriter writer = new DataMatrixWriter();
        BitMatrix matrix = null;

        matrix = writer.encode(text, BarcodeFormat.DATA_MATRIX, width, height);

        Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
        for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++){
                bmp.setPixel(x, y, matrix.get(x,y) ? Color.BLACK : Color.WHITE);
            }
        }
        return bmp;
    }

    public static Bitmap encodeToQrCode(String text, int width, int height,
                                        int dotColor, int backgroundColor){
        QRCodeWriter writer = new QRCodeWriter();
        BitMatrix matrix = null;
        try {
            matrix = writer.encode(text, BarcodeFormat.QR_CODE, width, height);
        } catch (WriterException ex) {
            ex.printStackTrace();
        }
        Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
        for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++){
                bmp.setPixel(x, y, matrix.get(x,y) ? dotColor : backgroundColor);
            }
        }
        return bmp;
    }
}
