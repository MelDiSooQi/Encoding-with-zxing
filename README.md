# Encoding-with-zxing
Encoding with zxing (Qr code, PDF 417)


Add library dependency

    compile project(path: ':encoding_zxing_lib')
    
To generate encode of QrCode

Example -1

        imageView.setImageBitmap(EncodingZxing.encodeToQrCode("Encoding with zxing", 500));
        
Example -2

    EncodingZxing.encodeToQrCode(text,
                                 width,
                                 height,
                                 dotColor,
                                 backgroundColor);
    ---------------------------------

        EncodingZxing.encodeToQrCode("Encoding with zxing",
                                      400,
                                      400,
                                      Color.BLACK,
                                      Color.WHITE);

        imageView.setImageBitmap(EncodingZxing.encodeToQrCode("Encoding with zxing", 500));

To generate encode of PDF417

        imageView.setImageBitmap(EncodingZxing.encodeToPDF417("Encoding with zxing", 500, Color.BLACK, Color.WHITE));
