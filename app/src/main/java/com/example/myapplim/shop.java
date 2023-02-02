package com.example.myapplim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shop extends AppCompatActivity {
    Button SAim; Button LAim; Button SKing; Button LKing; Button SBana; Button LBana; Button SMac; Button LMac; Button Skk; Button Lkk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        SAim  = findViewById(R.id.SAim);
        LAim  = findViewById(R.id.LAim);
        SKing  = findViewById(R.id.SKing);
        LKing  = findViewById(R.id.LKing);
        SBana  = findViewById(R.id.SBana);
        LBana  = findViewById(R.id.LBana);
        SMac  = findViewById(R.id.SMac);
        LMac  = findViewById(R.id.LMac);
        Skk  = findViewById(R.id.Skk);
        Lkk  = findViewById(R.id.Lkk);

        SAim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                goLink("https://shopee.co.th/%E0%B8%A1%E0%B8%B0%E0%B8%82%E0%B8%B2%E0%B8%A1%E0%B9%81%E0%B8%8A%E0%B9%88%E0%B8%AD%E0%B8%B4%E0%B9%88%E0%B8%A1-%E0%B9%84%E0%B8%A3%E0%B9%89%E0%B9%80%E0%B8%A1%E0%B8%A5%E0%B9%87%E0%B8%94-500-%E0%B8%81%E0%B8%A3%E0%B8%B1%E0%B8%A1-%E0%B8%9E%E0%B8%A3%E0%B9%89%E0%B8%AD%E0%B8%A1-%E0%B8%9E%E0%B8%A3%E0%B8%B4%E0%B8%81%E0%B9%80%E0%B8%81%E0%B8%A5%E0%B8%B7%E0%B8%AD-i.8234399.1191254408?utm_campaign=-&utm_content=mybest&utm_medium=affiliates&utm_source=an_15297270000");
            }
        });
        LAim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.lazada.co.th/products/500-i1056926882-s2358258873.html?clickTrackInfo=query%253A%2525E0%2525B8%2525A1%2525E0%2525B8%2525B0%2525E0%2525B8%252582%2525E0%2525B8%2525B2%2525E0%2525B8%2525A1%2525E0%2525B9%252581%2525E0%2525B8%25258A%2525E0%2525B9%252588%2525E0%2525B8%2525AD%2525E0%2525B8%2525B4%2525E0%2525B9%252588%2525E0%2525B8%2525A1%253Bnid%253A1056926882%253Bsrc%253ALazadaMainSrp%253Brn%253A13b063ee25e8d4d128e0d28c3b0a7491%253Bregion%253Ath%253Bsku%253A1056926882_TH%253Bprice%253A100181673083%253Bclient%253Adesktop%253Bsupplier_id%253A100181673083%253Basc_category_id%253A14543%253Bitem_id%253A1056926882%253Bsku_id%253A2358258873%253Bshop_id%253A1264876&fastshipping=0&freeshipping=0&fs_ab=2&fuse_fs=1&lang=th&location=%E0%B9%80%E0%B8%9E%E0%B8%8A%E0%B8%A3%E0%B8%9A%E0%B8%B9%E0%B8%A3%E0%B8%93%E0%B9%8C&price=1E%202&priceCompare=&ratingscore=4.874564459930314&request_id=13b063ee25e8d4d128e0d28c3b0a7491&review=287&sale=1936&search=1&source=search&spm=a2o4m.store_product.list.i40.10de11f409YKmh&stock=1");
            }
        });
        SKing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://shopee.co.th/Khaokhoherbary-%E0%B9%80%E0%B8%84%E0%B8%A3%E0%B8%B7%E0%B9%88%E0%B8%AD%E0%B8%87%E0%B8%94%E0%B8%B7%E0%B9%88%E0%B8%A1%E0%B8%82%E0%B8%B4%E0%B8%87%E0%B8%9C%E0%B8%87-Ginger-Powder-Drink-120-%E0%B8%81%E0%B8%A3%E0%B8%B1%E0%B8%A1-i.56711131.2143131986?sp_atk=160f9527-b5e0-47cf-a1f5-62daf4e6fe78&utm_campaign=-&utm_content=mybest&utm_medium=affiliates&utm_source=an_15297270000&xptdk=160f9527-b5e0-47cf-a1f5-62daf4e6fe78");
            }
        });
        LBana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.lazada.co.th/products/1-i4073139061-s15887339194.html?clickTrackInfo=query%253A%2525E0%2525B8%252581%2525E0%2525B8%2525A5%2525E0%2525B9%252589%2525E0%2525B8%2525A7%2525E0%2525B8%2525A2%2525E0%2525B8%2525AB%2525E0%2525B8%2525B4%2525E0%2525B8%252599%2525E0%2525B8%2525AD%2525E0%2525B8%25259A%2525E0%2525B8%252581%2525E0%2525B8%2525A3%2525E0%2525B8%2525AD%2525E0%2525B8%25259A%2525E0%2525B8%2525AA%2525E0%2525B8%2525AD%2525E0%2525B8%252594%2525E0%2525B9%252584%2525E0%2525B8%2525AA%2525E0%2525B9%252589%2525E0%2525B8%2525A1%2525E0%2525B8%2525B0%2525E0%2525B8%252582%2525E0%2525B8%2525B2%2525E0%2525B8%2525A1%2525E0%2525B8%252581%2525E0%2525B8%2525A7%2525E0%2525B8%252599%253Bnid%253A4073139061%253Bsrc%253ALazadaMainSrp%253Brn%253A80ac8e63c542d0d158a5c7c703876d47%253Bregion%253Ath%253Bsku%253A4073139061_TH%253Bprice%253A100195854068%253Bclient%253Adesktop%253Bsupplier_id%253A100195854068%253Basc_category_id%253A14965%253Bitem_id%253A4073139061%253Bsku_id%253A15887339194%253Bshop_id%253A2561066&fastshipping=0&freeshipping=0&fs_ab=2&fuse_fs=0&lang=th&location=%E0%B8%99%E0%B8%99%E0%B8%97%E0%B8%9A%E0%B8%B8%E0%B8%A3%E0%B8%B5&price=659&priceCompare=&ratingscore=0&request_id=80ac8e63c542d0d158a5c7c703876d47&review=&sale=0&search=1&source=search&spm=a2o4m.store_product.list.i13.6861d9dfMEGr1S&stock=1");
            }
        });
        SMac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://shopee.co.th/%E0%B9%81%E0%B8%A1%E0%B8%84%E0%B8%84%E0%B8%B2%E0%B9%80%E0%B8%94%E0%B9%80%E0%B8%A1%E0%B8%B5%E0%B8%A2%E0%B8%AD%E0%B8%9A%E0%B8%98%E0%B8%A3%E0%B8%A3%E0%B8%A1%E0%B8%8A%E0%B8%B2%E0%B8%95%E0%B8%B4%E0%B9%80%E0%B8%A1%E0%B9%87%E0%B8%94%E0%B9%80%E0%B8%95%E0%B9%87%E0%B8%A1%E0%B8%84%E0%B8%A5%E0%B8%B0%E0%B8%84%E0%B8%A3%E0%B8%B6%E0%B9%88%E0%B8%87%E0%B9%80%E0%B8%A1%E0%B9%87%E0%B8%94-%E0%B8%9A%E0%B8%A3%E0%B8%A3%E0%B8%88%E0%B8%B8-1-kg.-i.78030705.8080950497?sp_atk=401de755-4cb3-41bd-aeb0-3f1dc181e2fe&utm_campaign=-&utm_content=mybest&utm_medium=affiliates&utm_source=an_15297270000&xptdk=401de755-4cb3-41bd-aeb0-3f1dc181e2fe");
            }
        });
        LMac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.lazada.co.th/products/macadamia-roasted-keto-i3119642898-s11574779244.html?clickTrackInfo=query%253A%2525E0%2525B9%252581%2525E0%2525B8%2525A1%2525E0%2525B8%252584%2525E0%2525B8%252584%2525E0%2525B8%2525B2%2525E0%2525B9%252580%2525E0%2525B8%252594%2525E0%2525B9%252580%2525E0%2525B8%2525A1%2525E0%2525B8%2525B5%2525E0%2525B8%2525A2%2525E0%2525B8%2525AD%2525E0%2525B8%25259A%2525E0%2525B8%252598%2525E0%2525B8%2525A3%2525E0%2525B8%2525A3%2525E0%2525B8%2525A1%2525E0%2525B8%25258A%2525E0%2525B8%2525B2%2525E0%2525B8%252595%2525E0%2525B8%2525B4%253Bnid%253A3119642898%253Bsrc%253ALazadaMainSrp%253Brn%253A4464d76790f0019fb4506b2a5fd492ac%253Bregion%253Ath%253Bsku%253A3119642898_TH%253Bprice%253A100188423520%253Bclient%253Adesktop%253Bsupplier_id%253A100188423520%253Basc_category_id%253A14966%253Bitem_id%253A3119642898%253Bsku_id%253A11574779244%253Bshop_id%253A1910556&fastshipping=0&freeshipping=0&fs_ab=2&fuse_fs=1&lang=th&location=%E0%B8%81%E0%B8%A3%E0%B8%B8%E0%B8%87%E0%B9%80%E0%B8%97%E0%B8%9E%E0%B8%A1%E0%B8%AB%E0%B8%B2%E0%B8%99%E0%B8%84%E0%B8%A3&price=95&priceCompare=&ratingscore=4.900958466453674&request_id=4464d76790f0019fb4506b2a5fd492ac&review=313&sale=1293&search=1&source=search&spm=a2o4m.store_product.list.i40.46c84cebBS3xa4&stock=1");
            }
        });
        Skk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://shopee.co.th/%E0%B8%A1%E0%B8%B0%E0%B8%82%E0%B8%B2%E0%B8%A1%E0%B8%AB%E0%B8%A7%E0%B8%B2%E0%B8%99%E0%B9%80%E0%B8%9E%E0%B8%8A%E0%B8%A3%E0%B8%9A%E0%B8%B9%E0%B8%A3%E0%B8%93%E0%B9%8C-%E0%B8%A1%E0%B8%B0%E0%B8%82%E0%B8%B2%E0%B8%A1%E0%B8%AB%E0%B8%A7%E0%B8%B2%E0%B8%99%E0%B8%9E%E0%B8%B1%E0%B8%99%E0%B8%98%E0%B8%B8%E0%B9%8C%E0%B8%AA%E0%B8%B5%E0%B8%8A%E0%B8%A1%E0%B8%9E%E0%B8%B9-%E0%B8%A1%E0%B8%B0%E0%B8%82%E0%B8%B2%E0%B8%A1%E0%B8%AB%E0%B8%A7%E0%B8%B2%E0%B8%99%E0%B9%84%E0%B8%A3%E0%B9%89%E0%B9%80%E0%B8%A1%E0%B8%A5%E0%B9%87%E0%B8%94-%E0%B8%99%E0%B9%89%E0%B8%B3%E0%B8%AB%E0%B8%99%E0%B8%B1%E0%B8%81-100%E0%B8%81%E0%B8%A3%E0%B8%B1%E0%B8%A1-%E0%B8%96%E0%B8%B2%E0%B8%94%E0%B9%80%E0%B8%A5%E0%B9%87%E0%B8%81-%E0%B8%AA%E0%B8%B4%E0%B8%99%E0%B8%84%E0%B9%89%E0%B8%B2%E0%B9%82%E0%B8%AD%E0%B8%97%E0%B8%AD%E0%B8%9B-OTOP-%E0%B8%AD.%E0%B8%8A%E0%B8%99%E0%B9%81%E0%B8%94%E0%B8%99-i.112139493.5526775153?sp_atk=c5534310-b34f-4bb9-af58-2e850d32427d&utm_campaign=-&utm_content=mybest&utm_medium=affiliates&utm_source=an_15297270000");
            }
        });
        Lkk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.lazada.co.th/products/100-otop-i1971622180-s6297698905.html?exlaz=d_1:mm_150050845_51350205_2010350205::12:13920044294!125392363912!!!pla-294682000766!c!294682000766!6297698905!227939235&gclid=Cj0KCQiAieWOBhCYARIsANcOw0wKWEQRFSSY0zC5gfEQK5jkNIw4R0ZsMfBjEJhuWkY3OGSPxhuNTBAaAgZmEALw_wcB&trafficFrom=17449020_308357&laz_trackid=2:mm_150141143_51502503_2010552501:clkgiktve1gnngioq9dvhn&mkttid=clkgiktve1gnngioq9dvhn");
            }
        });
        LKing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.lazada.co.th/products/100-100-i3470950058-s12867953894.html?clickTrackInfo=query%253A%2525E0%2525B8%252582%2525E0%2525B8%2525B4%2525E0%2525B8%252587%2525E0%2525B8%25259C%2525E0%2525B8%252587%253Bnid%253A3470950058%253Bsrc%253ALazadaMainSrp%253Brn%253A20eb75bb0ba8bb71bc45dee03c0326e5%253Bregion%253Ath%253Bsku%253A3470950058_TH%253Bprice%253A1000527167%253Bclient%253Adesktop%253Bsupplier_id%253A1000527167%253Basc_category_id%253A6898%253Bitem_id%253A3470950058%253Bsku_id%253A12867953894%253Bshop_id%253A752094&fastshipping=0&freeshipping=0&fs_ab=1&fuse_fs=1&lang=th&location=%E0%B8%99%E0%B8%84%E0%B8%A3%E0%B8%9B%E0%B8%90%E0%B8%A1&price=32&priceCompare=&ratingscore=4.966101694915254&request_id=20eb75bb0ba8bb71bc45dee03c0326e5&review=59&sale=465&search=1&source=search&spm=a2o4m.store_product.list.i40.340f79beQhArnX&stock=1");
            }
        });
        SBana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://shopee.co.th/%E0%B8%81%E0%B8%A5%E0%B9%89%E0%B8%A7%E0%B8%A2-%E0%B8%AB%E0%B8%B4%E0%B8%99-%E0%B8%AD%E0%B8%9A%E0%B8%81%E0%B8%A3%E0%B8%AD%E0%B8%9A%E0%B8%AA%E0%B8%AD%E0%B8%94%E0%B9%84%E0%B8%AA%E0%B9%89%E0%B8%A1%E0%B8%B0%E0%B8%82%E0%B8%B2%E0%B8%A1%E0%B8%81%E0%B8%A7%E0%B8%99-1-%E0%B8%81%E0%B8%B4%E0%B9%82%E0%B8%A5%E0%B8%81%E0%B8%A3%E0%B8%B1%E0%B8%A1%E0%B9%80%E0%B8%95%E0%B9%87%E0%B8%A1%E0%B9%86-%E0%B8%A3%E0%B8%B2%E0%B8%84%E0%B8%B2%E0%B8%9E%E0%B8%B4%E0%B9%80%E0%B8%A8%E0%B8%A9%E0%B8%84%E0%B8%B8%E0%B8%93%E0%B8%A0%E0%B8%B2%E0%B8%9E%E0%B8%AA%E0%B9%88%E0%B8%87%E0%B8%AD%E0%B8%AD%E0%B8%81%F0%9F%98%8D%F0%9F%91%8C%F0%9F%91%8D-i.105986756.6337085801?sp_atk=b5c7d8a9-d947-4a34-a9fc-fbcafff1f5c6&utm_campaign=-&utm_content=mybest&utm_medium=affiliates&utm_source=an_15297270000");
            }
        });
    }

    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
    public void ShopNext (View view){
        Button tra01 = (Button) findViewById(R.id.tra01);
        Intent intent = new Intent(shop.this,MainActivity.class);
        startActivity(intent);
    }
    public void ShopSet (View view){
        Button set = (Button) findViewById(R.id.seto1);
        Intent intent = new Intent(shop.this,mom.class);
        startActivity(intent);
    }

}

