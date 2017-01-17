# Encoding-with-zxing
Encoding with zxing (Qr code, PDF 417)


Add library dependency

First add encoding_zxing_lib in your project
Then :

    compile project(path: ':encoding_zxing_lib')
    
To generate encode of QrCode

Example -1

        EncodingZxing.encodeToQrCode(text, size);
        ---------------------------------
        EncodingZxing.encodeToQrCode("Encoding with zxing", 500));
        ---------------------------------
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

To generate encode of PDF417

Example -1

        EncodingZxing.encodeToPDF417(text, size, dotColor, backgroundColor)
        ---------------------------------
        imageView.setImageBitmap(EncodingZxing.encodeToPDF417(text, size, dotColor, backgroundColor));
        ---------------------------------
        imageView.setImageBitmap(EncodingZxing.encodeToPDF417("Encoding with zxing", 500, Color.BLACK, Color.WHITE));
