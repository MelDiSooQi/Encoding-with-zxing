<img src="icon.png" align="right" />
# Encoding-with-zxing Android [![Encoding-with-zxing](https://cdn.rawgit.com/sindresorhus/awesome/d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)](https://github.com/MelDiSooQi/Encoding-with-zxing)
Encoding with zxing (Qr code, PDF 417)
> A curated list of encoding with zxing README

## Supported Formats

| 1D product | 1D industrial | 2D
| ---------- | ------------- | --------------
| UPC-A      | Code 39       | QR Code
| UPC-E      | Code 93       | Data Matrix
| EAN-8      | Code 128      | Aztec (beta)
| EAN-13     | Codabar       | PDF 417 (beta)
|            | ITF           |
|            | RSS-14        |
|            | RSS-Expanded  |

- [Berif](https://github.com/MelDiSooQi/Encoding-with-zxing) - Project logo. Clear description of what the project does. Build badges. Demo screenshot. Simple install and usage sections. Includes an examples section with common uses.

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
