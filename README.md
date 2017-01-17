# Encoding-with-zxing
Encoding with zxing (Qr code, PDF 417)


Add library dependency

    compile project(path: ':encoding_zxing_lib')

        imageView.setImageBitmap(EncodingZxing.encodeToQrCode("Encoding with zxing", 500));


        imageView.setImageBitmap(EncodingZxing.encodeToPDF417("Encoding with zxing", 500, Color.BLACK, Color.WHITE));
