# Encoding-with-zxing Android
Encoding with zxing (Qr code, PDF 417)

<img src="icon.png" align="right" />
# Awesome README [![Awesome](https://cdn.rawgit.com/sindresorhus/awesome/d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)](https://github.com/sindresorhus/awesome)
> A curated list of awesome README

Elements in beautiful READMEs include, but not limited to: images, screenshots, GIFs, text formatting, etc.

##Add library dependency

First add encoding_zxing_lib in your project
Then :

    compile project(path: ':encoding_zxing_lib')
    
##To generate encode of QrCode

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

##To generate encode of PDF417

Example -1

        EncodingZxing.encodeToPDF417(text, size, dotColor, backgroundColor)
        ---------------------------------
        imageView.setImageBitmap(EncodingZxing.encodeToPDF417(text, size, dotColor, backgroundColor));
        ---------------------------------
        imageView.setImageBitmap(EncodingZxing.encodeToPDF417("Encoding with zxing", 500, Color.BLACK, Color.WHITE));
