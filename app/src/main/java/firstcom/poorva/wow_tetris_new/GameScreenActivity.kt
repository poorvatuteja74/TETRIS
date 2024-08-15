package firstcom.poorva.wow_tetris_new
import firstcom.poorva.wow_tetris_new.databinding.ActivityGameScreenBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import kotlin.random.Random
import kotlin.random.nextInt

class GameScreenActivity : AppCompatActivity() {
    private lateinit var b_: ActivityGameScreenBinding
    private lateinit var downArray: ArrayList<TextView>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b_ = ActivityGameScreenBinding.inflate(layoutInflater)
        setContentView(b_.root)
        initializeDownArray()
        next_shape()
    }
    private fun initializeDownArray() {
        downArray= arrayListOf<TextView>(b_.textView5,b_.B1,b_.B2,b_.B3,b_.B4,b_.B5,b_.B6,b_.B7,b_.B8,b_.B9,b_.B10,b_.B11,b_.B12,b_.B13,b_.B14,b_.B15,b_.B16,b_.B17,b_.B18,b_.B19,b_.B20,b_.B21,b_.B22,b_.B23,b_.B24,b_.B25,b_.B26,b_.B27,b_.B28,b_.B29,b_.B30,
            b_.B31,b_.B32,b_.B33,b_.B34,b_.B35,b_.B36,b_.B37,b_.B38,b_.B39,b_.B40,b_.B41,b_.B42,b_.B42,b_.B43,b_.B44,b_.B45,b_.B46,b_.B47,b_.B48,b_.B49,b_.B50,b_.B51,b_.B52,b_.B53,b_.B54,b_.B55,b_.B56,b_.B57,b_.B58,b_.B59,b_.B60,b_.B61,b_.B62,b_.B63,b_.B64,b_.B65,b_.B66,b_.B67,b_.B68,b_.B69,b_.B70,
            b_.B71,b_.B72,b_.B73,b_.B74,b_.B75,b_.B76,b_.B77,b_.B78,b_.B79,b_.B80,b_.B81,b_.B82,b_.B83,b_.B84,b_.B85,b_.B86,b_.B87,b_.B88,b_.B89,b_.B90,b_.B91,b_.B92,b_.B93,b_.B94,b_.B95,b_.B96,b_.B97,b_.B98,b_.B99,b_.B100,b_.B101,b_.B102,b_.B103,b_.B104,b_.B105,b_.B106,b_.B107,b_.B108,b_.B109,b_.B110,
            b_.B111,b_.B112,b_.B113,b_.B114,b_.B115,b_.B116,b_.B117,b_.B118,b_.B119,b_.B120,b_.B121,b_.B122,b_.B123,b_.B124,b_.B125,b_.B126,b_.B127,b_.B128,b_.B129,b_.B130,b_.B131,b_.B132,b_.B133,b_.B134,b_.B135,b_.B136,b_.B137,b_.B138,b_.B139,b_.B140,
            b_.B141,b_.B142,b_.B143,b_.B144,b_.B145,b_.B146,b_.B147,b_.B148,b_.B149,b_.B150)

    }


    val arrayCollectionPreviousOne = arrayListOf<TextView>()
    val array = arrayListOf<TextView>()
    var a=0
    var b=0
    var z=0


    var nextUp:Int = 0
    var starting = 0
    var num1 = 0
    var num2 = 0
    var num3 = 0
    var num4 = 0
    var shape_is = 0
    var stop =0
    var lines = 0
    var once = 0
    //
    private fun lose_a_line(){

        if(b_.B11.text=="0"&& b_.B12.text=="0"&& b_.B13.text=="0"&& b_.B14.text=="0" && b_.B15.text=="0" && b_.B16.text=="0" && b_.B17.text=="0"  && b_.B18.text=="0" && b_.B19.text=="0" && b_.B20.text=="0"){
            b_.B11.setBackgroundResource(R.drawable.gray);b_.B12.setBackgroundResource(R.drawable.gray);b_.B13.setBackgroundResource(R.drawable.gray);b_.B14.setBackgroundResource(R.drawable.gray);b_.B15.setBackgroundResource(R.drawable.gray);
            b_.B16.setBackgroundResource(R.drawable.gray);b_.B17.setBackgroundResource(R.drawable.gray);b_.B18.setBackgroundResource(R.drawable.gray);b_.B19.setBackgroundResource(R.drawable.gray);b_.B20.setBackgroundResource(R.drawable.gray);
            b_.B11.text=="";b_.B12.text=="";b_.B13.text=="";b_.B14.text=="";b_.B15.text=="";b_.B16.text=="";b_.B17.text=="";b_.B18.text=="";b_.B19.text=="";b_.B20.text=="";points+=100;lines=2}
        if(b_.B21.text=="0"&& b_.B22.text=="0"&& b_.B23.text=="0"&& b_.B24.text=="0" && b_.B25.text=="0" && b_.B26.text=="0" && b_.B27.text=="0"  && b_.B28.text=="0" && b_.B29.text=="0" && b_.B30.text=="0"){
            b_.B21.setBackgroundResource(R.drawable.gray);b_.B22.setBackgroundResource(R.drawable.gray);b_.B23.setBackgroundResource(R.drawable.gray);b_.B24.setBackgroundResource(R.drawable.gray);b_.B25.setBackgroundResource(R.drawable.gray);
            b_.B26.setBackgroundResource(R.drawable.gray);b_.B27.setBackgroundResource(R.drawable.gray);b_.B28.setBackgroundResource(R.drawable.gray);b_.B29.setBackgroundResource(R.drawable.gray);b_.B30.setBackgroundResource(R.drawable.gray)
            b_.B21.text=="";b_.B22.text=="";b_.B23.text=="";b_.B24.text=="";b_.B25.text=="";b_.B26.text=="";b_.B27.text=="";b_.B28.text=="";b_.B29.text=="";b_.B30.text=="";points+=100;lines=3}
        if(b_.B31.text=="0"&& b_.B32.text=="0"&& b_.B33.text=="0"&& b_.B34.text=="0" && b_.B35.text=="0" && b_.B36.text=="0" && b_.B37.text=="0"  && b_.B38.text=="0" && b_.B39.text=="0" && b_.B40.text=="0"){
            b_.B31.setBackgroundResource(R.drawable.gray);b_.B32.setBackgroundResource(R.drawable.gray);b_.B33.setBackgroundResource(R.drawable.gray);b_.B34.setBackgroundResource(R.drawable.gray);b_.B35.setBackgroundResource(R.drawable.gray);
            b_.B36.setBackgroundResource(R.drawable.gray);b_.B37.setBackgroundResource(R.drawable.gray);b_.B38.setBackgroundResource(R.drawable.gray);b_.B39.setBackgroundResource(R.drawable.gray);b_.B40.setBackgroundResource(R.drawable.gray);
            b_.B31.text=="";b_.B32.text=="";b_.B33.text=="";b_.B34.text=="";b_.B35.text=="";b_.B36.text=="";b_.B37.text=="";b_.B38.text=="";b_.B39.text=="";b_.B40.text=="";points+=100;lines=4 }
        if(b_.B41.text=="0"&& b_.B42.text=="0"&& b_.B43.text=="0"&& b_.B44.text=="0" && b_.B45.text=="0" && b_.B46.text=="0" && b_.B47.text=="0"  && b_.B48.text=="0" && b_.B49.text=="0" && b_.B50.text=="0"){
            b_.B41.setBackgroundResource(R.drawable.gray);b_.B42.setBackgroundResource(R.drawable.gray);b_.B43.setBackgroundResource(R.drawable.gray);b_.B44.setBackgroundResource(R.drawable.gray);b_.B45.setBackgroundResource(R.drawable.gray);
            b_.B46.setBackgroundResource(R.drawable.gray);b_.B47.setBackgroundResource(R.drawable.gray);b_.B48.setBackgroundResource(R.drawable.gray);b_.B49.setBackgroundResource(R.drawable.gray);b_.B50.setBackgroundResource(R.drawable.gray);
            b_.B41.text=="";b_.B42.text=="";b_.B43.text=="";b_.B44.text=="";b_.B45.text=="";b_.B46.text=="";b_.B47.text=="";b_.B48.text=="";b_.B49.text=="";b_.B50.text=="";points+=100;lines=5 }
        if(b_.B51.text=="0"&& b_.B52.text=="0"&& b_.B53.text=="0"&& b_.B54.text=="0" && b_.B55.text=="0" && b_.B56.text=="0" && b_.B57.text=="0"  && b_.B58.text=="0" && b_.B59.text=="0" && b_.B60.text=="0"){
            b_.B51.setBackgroundResource(R.drawable.gray);b_.B52.setBackgroundResource(R.drawable.gray);b_.B53.setBackgroundResource(R.drawable.gray);b_.B54.setBackgroundResource(R.drawable.gray);b_.B55.setBackgroundResource(R.drawable.gray);
            b_.B56.setBackgroundResource(R.drawable.gray);b_.B57.setBackgroundResource(R.drawable.gray);b_.B58.setBackgroundResource(R.drawable.gray);b_.B59.setBackgroundResource(R.drawable.gray);b_.B60.setBackgroundResource(R.drawable.gray);
            b_.B51.text=="";b_.B52.text=="";b_.B53.text=="";b_.B54.text=="";b_.B55.text=="";b_.B56.text=="";b_.B57.text=="";b_.B58.text=="";b_.B59.text=="";b_.B60.text=="";points+=100;lines=6 }
        if(b_.B61.text=="0"&& b_.B62.text=="0"&& b_.B63.text=="0"&& b_.B64.text=="0" && b_.B65.text=="0" && b_.B66.text=="0" && b_.B67.text=="0"  && b_.B68.text=="0" && b_.B69.text=="0" && b_.B70.text=="0"){
            b_.B61.setBackgroundResource(R.drawable.gray);b_.B62.setBackgroundResource(R.drawable.gray);b_.B63.setBackgroundResource(R.drawable.gray);b_.B64.setBackgroundResource(R.drawable.gray);b_.B65.setBackgroundResource(R.drawable.gray);
            b_.B66.setBackgroundResource(R.drawable.gray);b_.B67.setBackgroundResource(R.drawable.gray);b_.B68.setBackgroundResource(R.drawable.gray);b_.B69.setBackgroundResource(R.drawable.gray);b_.B70.setBackgroundResource(R.drawable.gray);
            b_.B61.text=="";b_.B62.text=="";b_.B63.text=="";b_.B64.text=="";b_.B65.text=="";b_.B66.text=="";b_.B67.text=="";b_.B68.text=="";b_.B69.text=="";b_.B70.text=="";points+=100;lines=7}
        if(b_.B71.text=="0"&& b_.B72.text=="0"&& b_.B73.text=="0"&& b_.B74.text=="0" && b_.B75.text=="0" && b_.B76.text=="0" && b_.B77.text=="0"  && b_.B78.text=="0" && b_.B79.text=="0" && b_.B80.text=="0"){
            b_.B71.setBackgroundResource(R.drawable.gray);b_.B72.setBackgroundResource(R.drawable.gray);b_.B73.setBackgroundResource(R.drawable.gray);b_.B74.setBackgroundResource(R.drawable.gray);b_.B75.setBackgroundResource(R.drawable.gray);
            b_.B76.setBackgroundResource(R.drawable.gray);b_.B77.setBackgroundResource(R.drawable.gray);b_.B78.setBackgroundResource(R.drawable.gray);b_.B79.setBackgroundResource(R.drawable.gray);b_.B80.setBackgroundResource(R.drawable.gray);
            b_.B11.text=="";b_.B12.text=="";b_.B13.text=="";b_.B14.text=="";b_.B15.text=="";b_.B16.text=="";b_.B17.text=="";b_.B18.text=="";b_.B19.text=="";b_.B20.text=="";points+=100;lines=8}
        if(b_.B81.text=="0"&& b_.B82.text=="0"&& b_.B83.text=="0"&& b_.B84.text=="0" && b_.B85.text=="0" && b_.B86.text=="0" && b_.B87.text=="0"  && b_.B88.text=="0" && b_.B89.text=="0" && b_.B90.text=="0"){
            b_.B81.setBackgroundResource(R.drawable.gray);b_.B82.setBackgroundResource(R.drawable.gray);b_.B83.setBackgroundResource(R.drawable.gray);b_.B84.setBackgroundResource(R.drawable.gray);b_.B85.setBackgroundResource(R.drawable.gray);
            b_.B86.setBackgroundResource(R.drawable.gray);b_.B87.setBackgroundResource(R.drawable.gray);b_.B88.setBackgroundResource(R.drawable.gray);b_.B89.setBackgroundResource(R.drawable.gray);b_.B90.setBackgroundResource(R.drawable.gray);
            b_.B81.text=="";b_.B82.text=="";b_.B83.text=="";b_.B84.text=="";b_.B85.text=="";b_.B86.text=="";b_.B87.text=="";b_.B88.text=="";b_.B89.text=="";b_.B90.text=="";points+=100;lines=9}
        if(b_.B91.text=="0"&& b_.B92.text=="0"&& b_.B93.text=="0"&& b_.B94.text=="0" && b_.B95.text=="0" && b_.B96.text=="0" && b_.B97.text=="0"  && b_.B98.text=="0" && b_.B100.text=="0" && b_.B90.text=="0"){
            b_.B91.setBackgroundResource(R.drawable.gray);b_.B92.setBackgroundResource(R.drawable.gray);b_.B93.setBackgroundResource(R.drawable.gray);b_.B94.setBackgroundResource(R.drawable.gray);b_.B95.setBackgroundResource(R.drawable.gray);
            b_.B96.setBackgroundResource(R.drawable.gray);b_.B97.setBackgroundResource(R.drawable.gray);b_.B98.setBackgroundResource(R.drawable.gray);b_.B99.setBackgroundResource(R.drawable.gray);b_.B100.setBackgroundResource(R.drawable.gray);
            b_.B91.text=="";b_.B12.text=="";b_.B13.text=="";b_.B14.text=="";b_.B15.text=="";b_.B16.text=="";b_.B17.text=="";b_.B18.text=="";b_.B19.text=="";b_.B20.text=="";points+=100;lines=10}
        if(b_.B101.text=="0"&& b_.B102.text=="0"&& b_.B103.text=="0"&& b_.B104.text=="0" && b_.B105.text=="0" && b_.B106.text=="0" && b_.B107.text=="0"  && b_.B108.text=="0" && b_.B109.text=="0" && b_.B110.text=="0"){
            b_.B101.setBackgroundResource(R.drawable.gray);b_.B102.setBackgroundResource(R.drawable.gray);b_.B103.setBackgroundResource(R.drawable.gray);b_.B104.setBackgroundResource(R.drawable.gray);b_.B105.setBackgroundResource(R.drawable.gray);
            b_.B106.setBackgroundResource(R.drawable.gray);b_.B107.setBackgroundResource(R.drawable.gray);b_.B108.setBackgroundResource(R.drawable.gray);b_.B109.setBackgroundResource(R.drawable.gray);b_.B110.setBackgroundResource(R.drawable.gray);
            b_.B101.text=="";b_.B102.text=="";b_.B103.text=="";b_.B104.text=="";b_.B105.text=="";b_.B106.text=="";b_.B107.text=="";b_.B108.text=="";b_.B109.text=="";b_.B110.text=="";points+=100;lines=11}
        if(b_.B111.text=="0"&& b_.B112.text=="0"&& b_.B113.text=="0"&& b_.B114.text=="0" && b_.B115.text=="0" && b_.B116.text=="0" && b_.B117.text=="0"  && b_.B118.text=="0" && b_.B119.text=="0" && b_.B120.text=="0"){
            b_.B111.setBackgroundResource(R.drawable.gray);b_.B112.setBackgroundResource(R.drawable.gray);b_.B113.setBackgroundResource(R.drawable.gray);b_.B114.setBackgroundResource(R.drawable.gray);b_.B115.setBackgroundResource(R.drawable.gray);
            b_.B116.setBackgroundResource(R.drawable.gray);b_.B117.setBackgroundResource(R.drawable.gray);b_.B118.setBackgroundResource(R.drawable.gray);b_.B119.setBackgroundResource(R.drawable.gray);b_.B120.setBackgroundResource(R.drawable.gray)
            b_.B111.text=="";b_.B112.text=="";b_.B113.text=="";b_.B114.text=="";b_.B115.text=="";b_.B116.text=="";b_.B117.text=="";b_.B118.text=="";b_.B119.text=="";b_.B120.text=="";points+=100;lines=12 }
        if(b_.B121.text=="0"&& b_.B122.text=="0"&& b_.B123.text=="0"&& b_.B124.text=="0" && b_.B125.text=="0" && b_.B126.text=="0" && b_.B127.text=="0"  && b_.B128.text=="0" && b_.B129.text=="0" && b_.B130.text=="0"){
            b_.B121.setBackgroundResource(R.drawable.gray);b_.B122.setBackgroundResource(R.drawable.gray);b_.B123.setBackgroundResource(R.drawable.gray);b_.B124.setBackgroundResource(R.drawable.gray);b_.B125.setBackgroundResource(R.drawable.gray);
            b_.B126.setBackgroundResource(R.drawable.gray);b_.B127.setBackgroundResource(R.drawable.gray);b_.B128.setBackgroundResource(R.drawable.gray);b_.B129.setBackgroundResource(R.drawable.gray);b_.B130.setBackgroundResource(R.drawable.gray);
            b_.B121.text=="";b_.B122.text=="";b_.B123.text=="";b_.B124.text=="";b_.B125.text=="";b_.B126.text=="";b_.B127.text=="";b_.B128.text=="";b_.B129.text=="";b_.B130.text=="";points+=100;lines=13}
        if(b_.B131.text=="0"&& b_.B132.text=="0"&& b_.B133.text=="0"&& b_.B134.text=="0" && b_.B135.text=="0" && b_.B136.text=="0" && b_.B137.text=="0"  && b_.B138.text=="0" && b_.B139.text=="0" && b_.B140.text=="0"){
            b_.B131.setBackgroundResource(R.drawable.gray);b_.B132.setBackgroundResource(R.drawable.gray);b_.B133.setBackgroundResource(R.drawable.gray);b_.B134.setBackgroundResource(R.drawable.gray);b_.B135.setBackgroundResource(R.drawable.gray);
            b_.B136.setBackgroundResource(R.drawable.gray);b_.B137.setBackgroundResource(R.drawable.gray);b_.B138.setBackgroundResource(R.drawable.gray);b_.B139.setBackgroundResource(R.drawable.gray);b_.B140.setBackgroundResource(R.drawable.gray);
            b_.B131.text=="";b_.B132.text=="";b_.B133.text=="";b_.B134.text=="";b_.B135.text=="";b_.B136.text=="";b_.B137.text=="";b_.B138.text=="";b_.B139.text=="";b_.B140.text=="";points+=100;lines=14}
        if(b_.B141.text=="0"&& b_.B142.text=="0"&& b_.B143.text=="0"&& b_.B144.text=="0" && b_.B145.text=="0" && b_.B146.text=="0" && b_.B147.text=="0"  && b_.B148.text=="0" && b_.B149.text=="0" && b_.B150.text=="0"){
            b_.B141.setBackgroundResource(R.drawable.gray);b_.B142.setBackgroundResource(R.drawable.gray);b_.B143.setBackgroundResource(R.drawable.gray);b_.B144.setBackgroundResource(R.drawable.gray);b_.B145.setBackgroundResource(R.drawable.gray);
            b_.B146.setBackgroundResource(R.drawable.gray);b_.B147.setBackgroundResource(R.drawable.gray);b_.B148.setBackgroundResource(R.drawable.gray);b_.B149.setBackgroundResource(R.drawable.gray);b_.B150.setBackgroundResource(R.drawable.gray);
            b_.B141.text=="";b_.B142.text=="";b_.B143.text=="";b_.B144.text=="";b_.B145.text=="";b_.B146.text=="";b_.B147.text=="";b_.B148.text=="";b_.B149.text=="";b_.B150.text=="";points+=100;lines=15 }
        Handler().postDelayed({
            if(lines==15){

                if (b_.B111.text=="" && b_.B112.text=="" && b_.B113.text=="" && b_.B114.text=="" && b_.B115.text=="" && b_.B116.text=="" && b_.B117.text==""  && b_.B118.text=="" && b_.B119.text=="" && b_.B120.text==""){
                    b_.B111.text==b_.B101.text; b_.B112.text==b_.B102.text; b_.B113.text==b_.B103.text; b_.B114.text==b_.B104.text; b_.B115.text==b_.B105.text;
                    b_.B116.text==b_.B106.text; b_.B117.text==b_.B107.text; b_.B118.text==b_.B108.text; b_.B119.text==b_.B109.text; b_.B120.text==b_.B110.text;
                    b_.B111.background=b_.B101.background; b_.B112.background=b_.B102.background; b_.B113.background=b_.B103.background; b_.B114.background=b_.B104.background; b_.B115.background=b_.B105.background;
                    b_.B116.background=b_.B106.background; b_.B117.background= b_.B107.background; b_.B118.background= b_.B108.background; b_.B119.background=b_.B109.background; b_.B120.background=b_.B110.background;
                    b_.B101.setBackgroundResource(R.drawable.gray);b_.B102.setBackgroundResource(R.drawable.gray);b_.B103.setBackgroundResource(R.drawable.gray);b_.B104.setBackgroundResource(R.drawable.gray);b_.B105.setBackgroundResource(R.drawable.gray);
                    b_.B106.setBackgroundResource(R.drawable.gray);b_.B107.setBackgroundResource(R.drawable.gray);b_.B108.setBackgroundResource(R.drawable.gray);b_.B109.setBackgroundResource(R.drawable.gray);b_.B110.setBackgroundResource(R.drawable.gray);
                    b_.B101.text==""; b_.B102.text==""; b_.B103.text==""; b_.B104.text==""; b_.B105.text==""; b_.B106.text==""; b_.B107.text==""; b_.B108.text==""; b_.B109.text==""; b_.B110.text==""
                }
                if (b_.B121.text=="" && b_.B122.text=="" && b_.B123.text=="" && b_.B124.text=="" && b_.B125.text=="" && b_.B126.text=="" && b_.B127.text==""  && b_.B128.text=="" && b_.B129.text=="" && b_.B130.text==""){
                    b_.B121.text==b_.B111.text; b_.B122.text==b_.B112.text; b_.B123.text==b_.B113.text; b_.B124.text==b_.B114.text; b_.B125.text==b_.B115.text;
                    b_.B126.text==b_.B116.text; b_.B127.text==b_.B117.text; b_.B128.text==b_.B118.text; b_.B129.text==b_.B119.text; b_.B130.text==b_.B120.text;
                    b_.B121.background=b_.B111.background; b_.B122.background=b_.B112.background; b_.B123.background=b_.B113.background; b_.B124.background=b_.B114.background; b_.B125.background=b_.B115.background;
                    b_.B126.background=b_.B116.background; b_.B127.background= b_.B117.background; b_.B128.background= b_.B118.background; b_.B129.background=b_.B119.background; b_.B130.background=b_.B120.background;
                    b_.B111.setBackgroundResource(R.drawable.gray);b_.B112.setBackgroundResource(R.drawable.gray);b_.B113.setBackgroundResource(R.drawable.gray);b_.B114.setBackgroundResource(R.drawable.gray);b_.B115.setBackgroundResource(R.drawable.gray);
                    b_.B116.setBackgroundResource(R.drawable.gray);b_.B117.setBackgroundResource(R.drawable.gray);b_.B118.setBackgroundResource(R.drawable.gray);b_.B119.setBackgroundResource(R.drawable.gray);b_.B120.setBackgroundResource(R.drawable.gray);
                    b_.B111.text==""; b_.B112.text==""; b_.B113.text==""; b_.B114.text==""; b_.B115.text==""; b_.B116.text==""; b_.B117.text==""; b_.B118.text==""; b_.B119.text==""; b_.B120.text==""
                }
                if (b_.B131.text=="" && b_.B132.text=="" && b_.B133.text=="" && b_.B134.text=="" && b_.B135.text=="" && b_.B136.text=="" && b_.B137.text==""  && b_.B138.text=="" && b_.B139.text=="" && b_.B140.text==""){
                    b_.B131.text==b_.B121.text; b_.B132.text==b_.B122.text; b_.B133.text==b_.B123.text; b_.B134.text==b_.B124.text; b_.B135.text==b_.B125.text;
                    b_.B136.text==b_.B126.text; b_.B137.text==b_.B127.text; b_.B138.text==b_.B128.text; b_.B139.text==b_.B129.text; b_.B140.text==b_.B130.text;
                    b_.B131.background=b_.B121.background; b_.B132.background=b_.B122.background; b_.B133.background=b_.B123.background; b_.B134.background=b_.B124.background; b_.B135.background=b_.B125.background;
                    b_.B136.background=b_.B126.background; b_.B137.background= b_.B127.background; b_.B138.background= b_.B128.background; b_.B139.background=b_.B129.background; b_.B140.background=b_.B130.background;
                    b_.B121.setBackgroundResource(R.drawable.gray);b_.B122.setBackgroundResource(R.drawable.gray);b_.B123.setBackgroundResource(R.drawable.gray);b_.B124.setBackgroundResource(R.drawable.gray);b_.B125.setBackgroundResource(R.drawable.gray);
                    b_.B126.setBackgroundResource(R.drawable.gray);b_.B127.setBackgroundResource(R.drawable.gray);b_.B128.setBackgroundResource(R.drawable.gray);b_.B129.setBackgroundResource(R.drawable.gray);b_.B130.setBackgroundResource(R.drawable.gray);
                    b_.B121.text==""; b_.B122.text==""; b_.B123.text==""; b_.B124.text==""; b_.B125.text==""; b_.B126.text==""; b_.B127.text==""; b_.B128.text==""; b_.B129.text==""; b_.B130.text==""
                }
                if (b_.B141.text=="" && b_.B142.text=="" && b_.B143.text=="" && b_.B144.text=="" && b_.B145.text=="" && b_.B146.text=="" && b_.B147.text==""  && b_.B148.text=="" && b_.B149.text=="" && b_.B150.text==""){
                    b_.B141.text==b_.B131.text; b_.B142.text==b_.B132.text; b_.B143.text==b_.B133.text; b_.B144.text==b_.B134.text; b_.B145.text==b_.B135.text;
                    b_.B146.text==b_.B136.text; b_.B147.text==b_.B137.text; b_.B148.text==b_.B138.text; b_.B149.text==b_.B139.text; b_.B150.text==b_.B140.text;
                    b_.B141.background=b_.B131.background; b_.B142.background=b_.B132.background; b_.B143.background=b_.B133.background; b_.B144.background=b_.B134.background; b_.B145.background=b_.B135.background;
                    b_.B146.background=b_.B116.background; b_.B147.background= b_.B137.background; b_.B148.background= b_.B138.background; b_.B149.background=b_.B139.background; b_.B150.background=b_.B140.background;
                    b_.B131.setBackgroundResource(R.drawable.gray);b_.B132.setBackgroundResource(R.drawable.gray);b_.B133.setBackgroundResource(R.drawable.gray);b_.B134.setBackgroundResource(R.drawable.gray);b_.B135.setBackgroundResource(R.drawable.gray);
                    b_.B136.setBackgroundResource(R.drawable.gray);b_.B137.setBackgroundResource(R.drawable.gray);b_.B138.setBackgroundResource(R.drawable.gray);b_.B139.setBackgroundResource(R.drawable.gray);b_.B140.setBackgroundResource(R.drawable.gray);
                    b_.B131.text==""; b_.B132.text==""; b_.B133.text==""; b_.B134.text==""; b_.B135.text==""; b_.B136.text==""; b_.B137.text==""; b_.B138.text==""; b_.B139.text==""; b_.B140.text==""
                }
                lines=14}
            if(lines==14) {

                if (b_.B101.text=="" && b_.B102.text=="" && b_.B103.text=="" && b_.B104.text=="" && b_.B105.text=="" && b_.B106.text=="" && b_.B107.text==""  && b_.B108.text=="" && b_.B109.text=="" && b_.B110.text==""){
                    b_.B101.text==b_.B91.text; b_.B102.text==b_.B92.text; b_.B103.text==b_.B93.text; b_.B104.text==b_.B94.text; b_.B105.text==b_.B95.text;
                    b_.B106.text==b_.B96.text; b_.B107.text==b_.B97.text; b_.B108.text==b_.B98.text; b_.B109.text==b_.B99.text; b_.B110.text==b_.B100.text;
                    b_.B101.background=b_.B91.background; b_.B102.background=b_.B92.background; b_.B103.background=b_.B93.background; b_.B104.background=b_.B94.background; b_.B105.background=b_.B95.background;
                    b_.B106.background=b_.B96.background; b_.B107.background= b_.B97.background; b_.B108.background= b_.B98.background; b_.B109.background=b_.B99.background; b_.B110.background=b_.B100.background;
                    b_.B91.setBackgroundResource(R.drawable.gray);b_.B92.setBackgroundResource(R.drawable.gray);b_.B93.setBackgroundResource(R.drawable.gray);b_.B94.setBackgroundResource(R.drawable.gray);b_.B95.setBackgroundResource(R.drawable.gray);
                    b_.B96.setBackgroundResource(R.drawable.gray);b_.B97.setBackgroundResource(R.drawable.gray);b_.B98.setBackgroundResource(R.drawable.gray);b_.B99.setBackgroundResource(R.drawable.gray);b_.B100.setBackgroundResource(R.drawable.gray);
                    b_.B91.text==""; b_.B92.text==""; b_.B93.text==""; b_.B94.text==""; b_.B95.text==""; b_.B96.text==""; b_.B97.text==""; b_.B98.text==""; b_.B99.text==""; b_.B100.text==""
                }

                if (b_.B111.text=="" && b_.B112.text=="" && b_.B113.text=="" && b_.B114.text=="" && b_.B115.text=="" && b_.B116.text=="" && b_.B117.text==""  && b_.B118.text=="" && b_.B119.text=="" && b_.B120.text==""){
                    b_.B111.text==b_.B101.text; b_.B112.text==b_.B102.text; b_.B113.text==b_.B103.text; b_.B114.text==b_.B104.text; b_.B115.text==b_.B105.text;
                    b_.B116.text==b_.B106.text; b_.B117.text==b_.B107.text; b_.B118.text==b_.B108.text; b_.B119.text==b_.B109.text; b_.B120.text==b_.B110.text;
                    b_.B111.background=b_.B101.background; b_.B112.background=b_.B102.background; b_.B113.background=b_.B103.background; b_.B114.background=b_.B104.background; b_.B115.background=b_.B105.background;
                    b_.B116.background=b_.B106.background; b_.B117.background= b_.B107.background; b_.B118.background= b_.B108.background; b_.B119.background=b_.B109.background; b_.B120.background=b_.B110.background;
                    b_.B101.setBackgroundResource(R.drawable.gray);b_.B102.setBackgroundResource(R.drawable.gray);b_.B103.setBackgroundResource(R.drawable.gray);b_.B104.setBackgroundResource(R.drawable.gray);b_.B105.setBackgroundResource(R.drawable.gray);
                    b_.B106.setBackgroundResource(R.drawable.gray);b_.B107.setBackgroundResource(R.drawable.gray);b_.B108.setBackgroundResource(R.drawable.gray);b_.B109.setBackgroundResource(R.drawable.gray);b_.B110.setBackgroundResource(R.drawable.gray);
                    b_.B101.text==""; b_.B102.text==""; b_.B103.text==""; b_.B104.text==""; b_.B105.text==""; b_.B106.text==""; b_.B107.text==""; b_.B108.text==""; b_.B109.text==""; b_.B110.text==""
                }

                if (b_.B121.text=="" && b_.B122.text=="" && b_.B123.text=="" && b_.B124.text=="" && b_.B125.text=="" && b_.B126.text=="" && b_.B127.text==""  && b_.B128.text=="" && b_.B129.text=="" && b_.B130.text==""){
                    b_.B121.text==b_.B111.text; b_.B122.text==b_.B112.text; b_.B123.text==b_.B113.text; b_.B124.text==b_.B114.text; b_.B125.text==b_.B115.text;
                    b_.B126.text==b_.B116.text; b_.B127.text==b_.B117.text; b_.B128.text==b_.B118.text; b_.B129.text==b_.B119.text; b_.B130.text==b_.B120.text;
                    b_.B121.background=b_.B111.background; b_.B122.background=b_.B112.background; b_.B123.background=b_.B113.background; b_.B124.background=b_.B114.background; b_.B125.background=b_.B115.background;
                    b_.B126.background=b_.B116.background; b_.B127.background= b_.B117.background; b_.B128.background= b_.B118.background; b_.B129.background=b_.B119.background; b_.B130.background=b_.B120.background;
                    b_.B111.setBackgroundResource(R.drawable.gray);b_.B112.setBackgroundResource(R.drawable.gray);b_.B113.setBackgroundResource(R.drawable.gray);b_.B114.setBackgroundResource(R.drawable.gray);b_.B115.setBackgroundResource(R.drawable.gray);
                    b_.B116.setBackgroundResource(R.drawable.gray);b_.B117.setBackgroundResource(R.drawable.gray);b_.B118.setBackgroundResource(R.drawable.gray);b_.B119.setBackgroundResource(R.drawable.gray);b_.B120.setBackgroundResource(R.drawable.gray);
                    b_.B111.text==""; b_.B112.text==""; b_.B113.text==""; b_.B114.text==""; b_.B115.text==""; b_.B116.text==""; b_.B117.text==""; b_.B118.text==""; b_.B119.text==""; b_.B120.text==""
                }

                if (b_.B131.text=="" && b_.B132.text=="" && b_.B133.text=="" && b_.B134.text=="" && b_.B135.text=="" && b_.B136.text=="" && b_.B137.text==""  && b_.B138.text=="" && b_.B139.text=="" && b_.B140.text==""){
                    b_.B131.text==b_.B121.text; b_.B132.text==b_.B122.text; b_.B133.text==b_.B123.text; b_.B134.text==b_.B124.text; b_.B135.text==b_.B125.text;
                    b_.B136.text==b_.B126.text; b_.B137.text==b_.B127.text; b_.B138.text==b_.B128.text; b_.B139.text==b_.B129.text; b_.B140.text==b_.B130.text;
                    b_.B131.background=b_.B121.background; b_.B132.background=b_.B122.background; b_.B133.background=b_.B123.background; b_.B134.background=b_.B124.background; b_.B135.background=b_.B125.background;
                    b_.B136.background=b_.B126.background; b_.B137.background= b_.B127.background; b_.B138.background= b_.B128.background; b_.B139.background=b_.B129.background; b_.B140.background=b_.B130.background;
                    b_.B121.setBackgroundResource(R.drawable.gray);b_.B122.setBackgroundResource(R.drawable.gray);b_.B123.setBackgroundResource(R.drawable.gray);b_.B124.setBackgroundResource(R.drawable.gray);b_.B125.setBackgroundResource(R.drawable.gray);
                    b_.B126.setBackgroundResource(R.drawable.gray);b_.B127.setBackgroundResource(R.drawable.gray);b_.B128.setBackgroundResource(R.drawable.gray);b_.B129.setBackgroundResource(R.drawable.gray);b_.B130.setBackgroundResource(R.drawable.gray);
                    b_.B121.text==""; b_.B122.text==""; b_.B123.text==""; b_.B124.text==""; b_.B125.text==""; b_.B126.text==""; b_.B127.text==""; b_.B128.text==""; b_.B129.text==""; b_.B130.text==""
                }
                lines=13}
            if(lines==13){

                if (b_.B91.text=="" && b_.B92.text=="" && b_.B93.text=="" && b_.B94.text=="" && b_.B95.text=="" && b_.B96.text=="" && b_.B97.text==""  && b_.B98.text=="" && b_.B99.text=="" && b_.B100.text=="" ){
                    b_.B91.text==b_.B81.text; b_.B92.text==b_.B82.text; b_.B93.text==b_.B83.text; b_.B94.text==b_.B84.text; b_.B95.text==b_.B85.text;
                    b_.B96.text==b_.B86.text; b_.B97.text==b_.B87.text; b_.B98.text==b_.B88.text; b_.B99.text==b_.B89.text; b_.B100.text==b_.B90.text;
                    b_.B91.background=b_.B81.background; b_.B92.background=b_.B82.background; b_.B93.background=b_.B83.background; b_.B94.background=b_.B84.background; b_.B95.background=b_.B85.background;
                    b_.B96.background=b_.B86.background; b_.B97.background= b_.B87.background; b_.B98.background= b_.B88.background; b_.B99.background=b_.B89.background; b_.B100.background=b_.B90.background;
                    b_.B81.setBackgroundResource(R.drawable.gray);b_.B82.setBackgroundResource(R.drawable.gray);b_.B83.setBackgroundResource(R.drawable.gray);b_.B84.setBackgroundResource(R.drawable.gray);b_.B85.setBackgroundResource(R.drawable.gray);
                    b_.B86.setBackgroundResource(R.drawable.gray);b_.B87.setBackgroundResource(R.drawable.gray);b_.B88.setBackgroundResource(R.drawable.gray);b_.B89.setBackgroundResource(R.drawable.gray);b_.B90.setBackgroundResource(R.drawable.gray);
                    b_.B81.text==""; b_.B82.text==""; b_.B83.text==""; b_.B84.text==""; b_.B85.text==""; b_.B86.text==""; b_.B87.text==""; b_.B88.text==""; b_.B89.text==""; b_.B90.text==""
                }

                if (b_.B101.text=="" && b_.B102.text=="" && b_.B103.text=="" && b_.B104.text=="" && b_.B105.text=="" && b_.B106.text=="" && b_.B107.text==""  && b_.B108.text=="" && b_.B109.text=="" && b_.B110.text==""){
                    b_.B101.text==b_.B91.text; b_.B102.text==b_.B92.text; b_.B103.text==b_.B93.text; b_.B104.text==b_.B94.text; b_.B105.text==b_.B95.text;
                    b_.B106.text==b_.B96.text; b_.B107.text==b_.B97.text; b_.B108.text==b_.B98.text; b_.B109.text==b_.B99.text; b_.B110.text==b_.B100.text;
                    b_.B101.background=b_.B91.background; b_.B102.background=b_.B92.background; b_.B103.background=b_.B93.background; b_.B104.background=b_.B94.background; b_.B105.background=b_.B95.background;
                    b_.B106.background=b_.B96.background; b_.B107.background= b_.B97.background; b_.B108.background= b_.B98.background; b_.B109.background=b_.B99.background; b_.B110.background=b_.B100.background;
                    b_.B91.setBackgroundResource(R.drawable.gray);b_.B92.setBackgroundResource(R.drawable.gray);b_.B93.setBackgroundResource(R.drawable.gray);b_.B94.setBackgroundResource(R.drawable.gray);b_.B95.setBackgroundResource(R.drawable.gray);
                    b_.B96.setBackgroundResource(R.drawable.gray);b_.B97.setBackgroundResource(R.drawable.gray);b_.B98.setBackgroundResource(R.drawable.gray);b_.B99.setBackgroundResource(R.drawable.gray);b_.B100.setBackgroundResource(R.drawable.gray);
                    b_.B91.text==""; b_.B92.text==""; b_.B93.text==""; b_.B94.text==""; b_.B95.text==""; b_.B96.text==""; b_.B97.text==""; b_.B98.text==""; b_.B99.text==""; b_.B100.text==""
                }

                if (b_.B111.text=="" && b_.B112.text=="" && b_.B113.text=="" && b_.B114.text=="" && b_.B115.text=="" && b_.B116.text=="" && b_.B117.text==""  && b_.B118.text=="" && b_.B119.text=="" && b_.B120.text==""){
                    b_.B111.text==b_.B101.text; b_.B112.text==b_.B102.text; b_.B113.text==b_.B103.text; b_.B114.text==b_.B104.text; b_.B115.text==b_.B105.text;
                    b_.B116.text==b_.B106.text; b_.B117.text==b_.B107.text; b_.B118.text==b_.B108.text; b_.B119.text==b_.B109.text; b_.B120.text==b_.B110.text;
                    b_.B111.background=b_.B101.background; b_.B112.background=b_.B102.background; b_.B113.background=b_.B103.background; b_.B114.background=b_.B104.background; b_.B115.background=b_.B105.background;
                    b_.B116.background=b_.B106.background; b_.B117.background= b_.B107.background; b_.B118.background= b_.B108.background; b_.B119.background=b_.B109.background; b_.B120.background=b_.B110.background;
                    b_.B101.setBackgroundResource(R.drawable.gray);b_.B102.setBackgroundResource(R.drawable.gray);b_.B103.setBackgroundResource(R.drawable.gray);b_.B104.setBackgroundResource(R.drawable.gray);b_.B105.setBackgroundResource(R.drawable.gray);
                    b_.B106.setBackgroundResource(R.drawable.gray);b_.B107.setBackgroundResource(R.drawable.gray);b_.B108.setBackgroundResource(R.drawable.gray);b_.B109.setBackgroundResource(R.drawable.gray);b_.B110.setBackgroundResource(R.drawable.gray);
                    b_.B101.text==""; b_.B102.text==""; b_.B103.text==""; b_.B104.text==""; b_.B105.text==""; b_.B106.text==""; b_.B107.text==""; b_.B108.text==""; b_.B109.text==""; b_.B110.text==""
                }

                if (b_.B131.text=="" && b_.B132.text=="" && b_.B133.text=="" && b_.B134.text=="" && b_.B135.text=="" && b_.B136.text=="" && b_.B137.text==""  && b_.B138.text=="" && b_.B139.text=="" && b_.B140.text==""){
                    b_.B131.text==b_.B121.text; b_.B132.text==b_.B122.text; b_.B133.text==b_.B123.text; b_.B134.text==b_.B124.text; b_.B135.text==b_.B125.text;
                    b_.B136.text==b_.B126.text; b_.B137.text==b_.B127.text; b_.B138.text==b_.B128.text; b_.B139.text==b_.B129.text; b_.B140.text==b_.B130.text;
                    b_.B131.background=b_.B121.background; b_.B132.background=b_.B122.background; b_.B133.background=b_.B123.background; b_.B134.background=b_.B124.background; b_.B135.background=b_.B125.background;
                    b_.B136.background=b_.B126.background; b_.B137.background= b_.B127.background; b_.B138.background= b_.B128.background; b_.B139.background=b_.B129.background; b_.B140.background=b_.B130.background;
                    b_.B121.setBackgroundResource(R.drawable.gray);b_.B122.setBackgroundResource(R.drawable.gray);b_.B123.setBackgroundResource(R.drawable.gray);b_.B124.setBackgroundResource(R.drawable.gray);b_.B125.setBackgroundResource(R.drawable.gray);
                    b_.B126.setBackgroundResource(R.drawable.gray);b_.B127.setBackgroundResource(R.drawable.gray);b_.B128.setBackgroundResource(R.drawable.gray);b_.B129.setBackgroundResource(R.drawable.gray);b_.B130.setBackgroundResource(R.drawable.gray);
                    b_.B121.text==""; b_.B122.text==""; b_.B123.text==""; b_.B124.text==""; b_.B125.text==""; b_.B126.text==""; b_.B127.text==""; b_.B128.text==""; b_.B129.text==""; b_.B130.text==""
                }
                lines=12}
            if(lines==12){
                if (b_.B81.text=="" && b_.B82.text=="" && b_.B83.text=="" && b_.B84.text=="" && b_.B85.text=="" && b_.B86.text=="" && b_.B87.text==""  && b_.B88.text=="" && b_.B89.text=="" && b_.B90.text==""){
                    b_.B81.text==b_.B71.text; b_.B82.text==b_.B72.text; b_.B83.text==b_.B73.text; b_.B84.text==b_.B74.text; b_.B85.text==b_.B75.text;
                    b_.B86.text==b_.B76.text; b_.B87.text==b_.B77.text; b_.B88.text==b_.B78.text; b_.B89.text==b_.B79.text; b_.B90.text==b_.B80.text;
                    b_.B81.background=b_.B71.background; b_.B82.background=b_.B72.background; b_.B83.background=b_.B73.background; b_.B84.background=b_.B74.background; b_.B85.background=b_.B75.background;
                    b_.B86.background=b_.B76.background; b_.B87.background= b_.B77.background; b_.B88.background= b_.B78.background; b_.B89.background=b_.B79.background; b_.B90.background=b_.B80.background;
                    b_.B71.setBackgroundResource(R.drawable.gray);b_.B72.setBackgroundResource(R.drawable.gray);b_.B73.setBackgroundResource(R.drawable.gray);b_.B74.setBackgroundResource(R.drawable.gray);b_.B75.setBackgroundResource(R.drawable.gray);
                    b_.B76.setBackgroundResource(R.drawable.gray);b_.B77.setBackgroundResource(R.drawable.gray);b_.B78.setBackgroundResource(R.drawable.gray);b_.B79.setBackgroundResource(R.drawable.gray);b_.B80.setBackgroundResource(R.drawable.gray);
                    b_.B71.text==""; b_.B72.text==""; b_.B73.text==""; b_.B74.text==""; b_.B75.text==""; b_.B76.text==""; b_.B77.text==""; b_.B78.text==""; b_.B79.text==""; b_.B80.text==""
                }

                if (b_.B91.text=="" && b_.B92.text=="" && b_.B93.text=="" && b_.B94.text=="" && b_.B95.text=="" && b_.B96.text=="" && b_.B97.text==""  && b_.B98.text=="" && b_.B99.text=="" && b_.B100.text==""){
                    b_.B91.text==b_.B81.text; b_.B92.text==b_.B82.text; b_.B93.text==b_.B83.text; b_.B94.text==b_.B84.text; b_.B95.text==b_.B85.text;
                    b_.B96.text==b_.B86.text; b_.B97.text==b_.B87.text; b_.B98.text==b_.B88.text; b_.B99.text==b_.B89.text; b_.B100.text==b_.B90.text;
                    b_.B91.background=b_.B81.background; b_.B92.background=b_.B82.background; b_.B93.background=b_.B83.background; b_.B94.background=b_.B84.background; b_.B95.background=b_.B85.background;
                    b_.B96.background=b_.B86.background; b_.B97.background= b_.B87.background; b_.B98.background= b_.B88.background; b_.B99.background=b_.B89.background; b_.B100.background=b_.B90.background;
                    b_.B81.setBackgroundResource(R.drawable.gray);b_.B82.setBackgroundResource(R.drawable.gray);b_.B83.setBackgroundResource(R.drawable.gray);b_.B84.setBackgroundResource(R.drawable.gray);b_.B85.setBackgroundResource(R.drawable.gray);
                    b_.B86.setBackgroundResource(R.drawable.gray);b_.B87.setBackgroundResource(R.drawable.gray);b_.B88.setBackgroundResource(R.drawable.gray);b_.B89.setBackgroundResource(R.drawable.gray);b_.B90.setBackgroundResource(R.drawable.gray);
                    b_.B81.text==""; b_.B82.text==""; b_.B83.text==""; b_.B84.text==""; b_.B85.text==""; b_.B86.text==""; b_.B87.text==""; b_.B88.text==""; b_.B89.text==""; b_.B90.text==""
                }

                if (b_.B101.text=="" && b_.B102.text=="" && b_.B103.text=="" && b_.B104.text=="" && b_.B105.text=="" && b_.B106.text=="" && b_.B107.text==""  && b_.B108.text=="" && b_.B109.text=="" && b_.B110.text==""){
                    b_.B101.text==b_.B91.text; b_.B102.text==b_.B92.text; b_.B103.text==b_.B93.text; b_.B104.text==b_.B94.text; b_.B105.text==b_.B95.text;
                    b_.B106.text==b_.B96.text; b_.B107.text==b_.B97.text; b_.B108.text==b_.B98.text; b_.B109.text==b_.B99.text; b_.B110.text==b_.B100.text;
                    b_.B101.background=b_.B91.background; b_.B102.background=b_.B92.background; b_.B103.background=b_.B93.background; b_.B104.background=b_.B94.background; b_.B105.background=b_.B95.background;
                    b_.B106.background=b_.B96.background; b_.B107.background= b_.B97.background; b_.B108.background= b_.B98.background; b_.B109.background=b_.B99.background; b_.B110.background=b_.B100.background;
                    b_.B91.setBackgroundResource(R.drawable.gray);b_.B92.setBackgroundResource(R.drawable.gray);b_.B93.setBackgroundResource(R.drawable.gray);b_.B94.setBackgroundResource(R.drawable.gray);b_.B95.setBackgroundResource(R.drawable.gray);
                    b_.B96.setBackgroundResource(R.drawable.gray);b_.B97.setBackgroundResource(R.drawable.gray);b_.B98.setBackgroundResource(R.drawable.gray);b_.B99.setBackgroundResource(R.drawable.gray);b_.B100.setBackgroundResource(R.drawable.gray);
                    b_.B91.text==""; b_.B92.text==""; b_.B93.text==""; b_.B94.text==""; b_.B95.text==""; b_.B96.text==""; b_.B97.text==""; b_.B98.text==""; b_.B99.text==""; b_.B100.text==""
                }

                if (b_.B111.text=="" && b_.B112.text=="" && b_.B113.text=="" && b_.B114.text=="" && b_.B115.text=="" && b_.B116.text=="" && b_.B117.text==""  && b_.B118.text=="" && b_.B119.text=="" && b_.B120.text==""){
                    b_.B111.text==b_.B101.text; b_.B112.text==b_.B102.text; b_.B113.text==b_.B103.text; b_.B114.text==b_.B104.text; b_.B115.text==b_.B105.text;
                    b_.B116.text==b_.B106.text; b_.B117.text==b_.B107.text; b_.B118.text==b_.B108.text; b_.B119.text==b_.B109.text; b_.B120.text==b_.B110.text;
                    b_.B111.background=b_.B101.background; b_.B112.background=b_.B102.background; b_.B113.background=b_.B103.background; b_.B114.background=b_.B104.background; b_.B115.background=b_.B105.background;
                    b_.B116.background=b_.B106.background; b_.B117.background= b_.B107.background; b_.B118.background= b_.B108.background; b_.B119.background=b_.B109.background; b_.B120.background=b_.B110.background;
                    b_.B101.setBackgroundResource(R.drawable.gray);b_.B102.setBackgroundResource(R.drawable.gray);b_.B103.setBackgroundResource(R.drawable.gray);b_.B104.setBackgroundResource(R.drawable.gray);b_.B105.setBackgroundResource(R.drawable.gray);
                    b_.B106.setBackgroundResource(R.drawable.gray);b_.B107.setBackgroundResource(R.drawable.gray);b_.B108.setBackgroundResource(R.drawable.gray);b_.B109.setBackgroundResource(R.drawable.gray);b_.B110.setBackgroundResource(R.drawable.gray);
                    b_.B101.text==""; b_.B102.text==""; b_.B103.text==""; b_.B104.text==""; b_.B105.text==""; b_.B106.text==""; b_.B107.text==""; b_.B108.text==""; b_.B109.text==""; b_.B110.text==""
                }
                lines=11}
            if(lines==11){

                if (b_.B71.text=="" && b_.B72.text=="" && b_.B73.text=="" && b_.B74.text=="" && b_.B75.text=="" && b_.B76.text=="" && b_.B77.text==""  && b_.B78.text=="" && b_.B79.text=="" && b_.B80.text==""){
                    b_.B71.text==b_.B61.text; b_.B72.text==b_.B62.text; b_.B73.text==b_.B63.text; b_.B74.text==b_.B64.text; b_.B75.text==b_.B65.text;
                    b_.B76.text==b_.B66.text; b_.B77.text==b_.B67.text; b_.B78.text==b_.B68.text; b_.B79.text==b_.B69.text; b_.B80.text==b_.B70.text;
                    b_.B71.background=b_.B61.background; b_.B72.background=b_.B62.background; b_.B73.background=b_.B63.background; b_.B74.background=b_.B64.background; b_.B75.background=b_.B65.background;
                    b_.B76.background=b_.B66.background; b_.B77.background= b_.B67.background; b_.B78.background= b_.B68.background; b_.B79.background=b_.B69.background; b_.B80.background=b_.B70.background;
                    b_.B61.setBackgroundResource(R.drawable.gray);b_.B62.setBackgroundResource(R.drawable.gray);b_.B63.setBackgroundResource(R.drawable.gray);b_.B64.setBackgroundResource(R.drawable.gray);b_.B65.setBackgroundResource(R.drawable.gray);
                    b_.B66.setBackgroundResource(R.drawable.gray);b_.B67.setBackgroundResource(R.drawable.gray);b_.B68.setBackgroundResource(R.drawable.gray);b_.B69.setBackgroundResource(R.drawable.gray);b_.B70.setBackgroundResource(R.drawable.gray);
                    b_.B61.text==""; b_.B62.text==""; b_.B63.text==""; b_.B64.text==""; b_.B65.text==""; b_.B66.text==""; b_.B67.text==""; b_.B68.text==""; b_.B69.text==""; b_.B70.text==""
                }


                if (b_.B81.text=="" && b_.B82.text=="" && b_.B83.text=="" && b_.B84.text=="" && b_.B85.text=="" && b_.B86.text=="" && b_.B87.text==""  && b_.B88.text=="" && b_.B89.text=="" && b_.B90.text==""){
                    b_.B81.text==b_.B71.text; b_.B82.text==b_.B72.text; b_.B83.text==b_.B73.text; b_.B84.text==b_.B74.text; b_.B85.text==b_.B75.text;
                    b_.B86.text==b_.B76.text; b_.B87.text==b_.B77.text; b_.B88.text==b_.B78.text; b_.B89.text==b_.B79.text; b_.B90.text==b_.B80.text;
                    b_.B81.background=b_.B71.background; b_.B82.background=b_.B72.background; b_.B83.background=b_.B73.background; b_.B84.background=b_.B74.background; b_.B85.background=b_.B75.background;
                    b_.B86.background=b_.B76.background; b_.B87.background= b_.B77.background; b_.B88.background= b_.B78.background; b_.B89.background=b_.B79.background; b_.B90.background=b_.B80.background;
                    b_.B71.setBackgroundResource(R.drawable.gray);b_.B72.setBackgroundResource(R.drawable.gray);b_.B73.setBackgroundResource(R.drawable.gray);b_.B74.setBackgroundResource(R.drawable.gray);b_.B75.setBackgroundResource(R.drawable.gray);
                    b_.B76.setBackgroundResource(R.drawable.gray);b_.B77.setBackgroundResource(R.drawable.gray);b_.B78.setBackgroundResource(R.drawable.gray);b_.B79.setBackgroundResource(R.drawable.gray);b_.B80.setBackgroundResource(R.drawable.gray);
                    b_.B71.text==""; b_.B72.text==""; b_.B73.text==""; b_.B74.text==""; b_.B75.text==""; b_.B76.text==""; b_.B77.text==""; b_.B78.text==""; b_.B79.text==""; b_.B80.text==""
                }

                if (b_.B91.text=="" && b_.B92.text=="" && b_.B93.text=="" && b_.B94.text=="" && b_.B95.text=="" && b_.B96.text=="" && b_.B97.text==""  && b_.B98.text=="" && b_.B99.text=="" && b_.B100.text==""){
                    b_.B91.text==b_.B81.text; b_.B92.text==b_.B82.text; b_.B93.text==b_.B83.text; b_.B94.text==b_.B84.text; b_.B95.text==b_.B85.text;
                    b_.B96.text==b_.B86.text; b_.B97.text==b_.B87.text; b_.B98.text==b_.B88.text; b_.B99.text==b_.B89.text; b_.B100.text==b_.B90.text;
                    b_.B91.background=b_.B81.background; b_.B92.background=b_.B82.background; b_.B93.background=b_.B83.background; b_.B94.background=b_.B84.background; b_.B95.background=b_.B85.background;
                    b_.B96.background=b_.B86.background; b_.B97.background= b_.B87.background; b_.B98.background= b_.B88.background; b_.B99.background=b_.B89.background; b_.B100.background=b_.B90.background;
                    b_.B81.setBackgroundResource(R.drawable.gray);b_.B82.setBackgroundResource(R.drawable.gray);b_.B83.setBackgroundResource(R.drawable.gray);b_.B84.setBackgroundResource(R.drawable.gray);b_.B85.setBackgroundResource(R.drawable.gray);
                    b_.B86.setBackgroundResource(R.drawable.gray);b_.B87.setBackgroundResource(R.drawable.gray);b_.B88.setBackgroundResource(R.drawable.gray);b_.B89.setBackgroundResource(R.drawable.gray);b_.B90.setBackgroundResource(R.drawable.gray);
                    b_.B81.text==""; b_.B82.text==""; b_.B83.text==""; b_.B84.text==""; b_.B85.text==""; b_.B86.text==""; b_.B87.text==""; b_.B88.text==""; b_.B89.text==""; b_.B90.text==""
                }

                if (b_.B101.text=="" && b_.B102.text=="" && b_.B103.text=="" && b_.B104.text=="" && b_.B105.text=="" && b_.B106.text=="" && b_.B107.text==""  && b_.B108.text=="" && b_.B109.text=="" && b_.B110.text==""){
                    b_.B101.text==b_.B91.text; b_.B102.text==b_.B92.text; b_.B103.text==b_.B93.text; b_.B104.text==b_.B94.text; b_.B105.text==b_.B95.text;
                    b_.B106.text==b_.B96.text; b_.B107.text==b_.B97.text; b_.B108.text==b_.B98.text; b_.B109.text==b_.B99.text; b_.B110.text==b_.B100.text;
                    b_.B101.background=b_.B91.background; b_.B102.background=b_.B92.background; b_.B103.background=b_.B93.background; b_.B104.background=b_.B94.background; b_.B105.background=b_.B95.background;
                    b_.B106.background=b_.B96.background; b_.B107.background= b_.B97.background; b_.B108.background= b_.B98.background; b_.B109.background=b_.B99.background; b_.B110.background=b_.B100.background;
                    b_.B91.setBackgroundResource(R.drawable.gray);b_.B92.setBackgroundResource(R.drawable.gray);b_.B93.setBackgroundResource(R.drawable.gray);b_.B94.setBackgroundResource(R.drawable.gray);b_.B95.setBackgroundResource(R.drawable.gray);
                    b_.B96.setBackgroundResource(R.drawable.gray);b_.B97.setBackgroundResource(R.drawable.gray);b_.B98.setBackgroundResource(R.drawable.gray);b_.B99.setBackgroundResource(R.drawable.gray);b_.B100.setBackgroundResource(R.drawable.gray);
                    b_.B91.text==""; b_.B92.text==""; b_.B93.text==""; b_.B94.text==""; b_.B95.text==""; b_.B96.text==""; b_.B97.text==""; b_.B98.text==""; b_.B99.text==""; b_.B100.text==""
                }
                lines=10}
            if(lines==10){

                if (b_.B61.text=="" && b_.B62.text=="" && b_.B63.text=="" && b_.B64.text=="" && b_.B65.text=="" && b_.B66.text=="" && b_.B67.text==""  && b_.B68.text=="" && b_.B69.text=="" && b_.B70.text==""){
                    b_.B61.text==b_.B51.text; b_.B62.text==b_.B52.text; b_.B63.text==b_.B53.text; b_.B64.text==b_.B54.text; b_.B65.text==b_.B55.text;
                    b_.B66.text==b_.B56.text; b_.B67.text==b_.B57.text; b_.B68.text==b_.B58.text; b_.B69.text==b_.B59.text; b_.B70.text==b_.B60.text;
                    b_.B61.background=b_.B51.background; b_.B62.background=b_.B52.background; b_.B63.background=b_.B53.background; b_.B64.background=b_.B54.background; b_.B65.background=b_.B55.background;
                    b_.B66.background=b_.B56.background; b_.B67.background= b_.B57.background; b_.B68.background= b_.B58.background; b_.B69.background=b_.B59.background; b_.B70.background=b_.B60.background;
                    b_.B51.setBackgroundResource(R.drawable.gray);b_.B52.setBackgroundResource(R.drawable.gray);b_.B53.setBackgroundResource(R.drawable.gray);b_.B54.setBackgroundResource(R.drawable.gray);b_.B55.setBackgroundResource(R.drawable.gray);
                    b_.B56.setBackgroundResource(R.drawable.gray);b_.B57.setBackgroundResource(R.drawable.gray);b_.B58.setBackgroundResource(R.drawable.gray);b_.B59.setBackgroundResource(R.drawable.gray);b_.B60.setBackgroundResource(R.drawable.gray);
                    b_.B51.text==""; b_.B52.text==""; b_.B53.text==""; b_.B54.text==""; b_.B55.text==""; b_.B56.text==""; b_.B57.text==""; b_.B58.text==""; b_.B59.text==""; b_.B60.text==""
                }

                if (b_.B71.text=="" && b_.B72.text=="" && b_.B73.text=="" && b_.B74.text=="" && b_.B75.text=="" && b_.B76.text=="" && b_.B77.text==""  && b_.B78.text=="" && b_.B79.text=="" && b_.B80.text==""){
                    b_.B71.text==b_.B61.text; b_.B72.text==b_.B62.text; b_.B73.text==b_.B63.text; b_.B74.text==b_.B64.text; b_.B75.text==b_.B65.text;
                    b_.B76.text==b_.B66.text; b_.B77.text==b_.B67.text; b_.B78.text==b_.B68.text; b_.B79.text==b_.B69.text; b_.B80.text==b_.B70.text;
                    b_.B71.background=b_.B61.background; b_.B72.background=b_.B62.background; b_.B73.background=b_.B63.background; b_.B74.background=b_.B64.background; b_.B75.background=b_.B65.background;
                    b_.B76.background=b_.B66.background; b_.B77.background= b_.B67.background; b_.B78.background= b_.B68.background; b_.B79.background=b_.B69.background; b_.B80.background=b_.B70.background;
                    b_.B61.setBackgroundResource(R.drawable.gray);b_.B62.setBackgroundResource(R.drawable.gray);b_.B63.setBackgroundResource(R.drawable.gray);b_.B64.setBackgroundResource(R.drawable.gray);b_.B65.setBackgroundResource(R.drawable.gray);
                    b_.B66.setBackgroundResource(R.drawable.gray);b_.B67.setBackgroundResource(R.drawable.gray);b_.B68.setBackgroundResource(R.drawable.gray);b_.B69.setBackgroundResource(R.drawable.gray);b_.B70.setBackgroundResource(R.drawable.gray);
                    b_.B61.text==""; b_.B62.text==""; b_.B63.text==""; b_.B64.text==""; b_.B65.text==""; b_.B66.text==""; b_.B67.text==""; b_.B68.text==""; b_.B69.text==""; b_.B70.text==""
                }


                if (b_.B81.text=="" && b_.B82.text=="" && b_.B83.text=="" && b_.B84.text=="" && b_.B85.text=="" && b_.B86.text=="" && b_.B87.text==""  && b_.B88.text=="" && b_.B89.text=="" && b_.B90.text==""){
                    b_.B81.text==b_.B71.text; b_.B82.text==b_.B72.text; b_.B83.text==b_.B73.text; b_.B84.text==b_.B74.text; b_.B85.text==b_.B75.text;
                    b_.B86.text==b_.B76.text; b_.B87.text==b_.B77.text; b_.B88.text==b_.B78.text; b_.B89.text==b_.B79.text; b_.B90.text==b_.B80.text;
                    b_.B81.background=b_.B71.background; b_.B82.background=b_.B72.background; b_.B83.background=b_.B73.background; b_.B84.background=b_.B74.background; b_.B85.background=b_.B75.background;
                    b_.B86.background=b_.B76.background; b_.B87.background= b_.B77.background; b_.B88.background= b_.B78.background; b_.B89.background=b_.B79.background; b_.B90.background=b_.B80.background;
                    b_.B71.setBackgroundResource(R.drawable.gray);b_.B72.setBackgroundResource(R.drawable.gray);b_.B73.setBackgroundResource(R.drawable.gray);b_.B74.setBackgroundResource(R.drawable.gray);b_.B75.setBackgroundResource(R.drawable.gray);
                    b_.B76.setBackgroundResource(R.drawable.gray);b_.B77.setBackgroundResource(R.drawable.gray);b_.B78.setBackgroundResource(R.drawable.gray);b_.B79.setBackgroundResource(R.drawable.gray);b_.B80.setBackgroundResource(R.drawable.gray);
                    b_.B71.text==""; b_.B72.text==""; b_.B73.text==""; b_.B74.text==""; b_.B75.text==""; b_.B76.text==""; b_.B77.text==""; b_.B78.text==""; b_.B79.text==""; b_.B80.text==""
                }

                if (b_.B91.text=="" && b_.B92.text=="" && b_.B93.text=="" && b_.B94.text=="" && b_.B95.text=="" && b_.B96.text=="" && b_.B97.text==""  && b_.B98.text=="" && b_.B99.text=="" && b_.B100.text==""){
                    b_.B91.text==b_.B81.text; b_.B92.text==b_.B82.text; b_.B93.text==b_.B83.text; b_.B94.text==b_.B84.text; b_.B95.text==b_.B85.text;
                    b_.B96.text==b_.B86.text; b_.B97.text==b_.B87.text; b_.B98.text==b_.B88.text; b_.B99.text==b_.B89.text; b_.B100.text==b_.B90.text;
                    b_.B91.background=b_.B81.background; b_.B92.background=b_.B82.background; b_.B93.background=b_.B83.background; b_.B94.background=b_.B84.background; b_.B95.background=b_.B85.background;
                    b_.B96.background=b_.B86.background; b_.B97.background= b_.B87.background; b_.B98.background= b_.B88.background; b_.B99.background=b_.B89.background; b_.B100.background=b_.B90.background;
                    b_.B81.setBackgroundResource(R.drawable.gray);b_.B82.setBackgroundResource(R.drawable.gray);b_.B83.setBackgroundResource(R.drawable.gray);b_.B84.setBackgroundResource(R.drawable.gray);b_.B85.setBackgroundResource(R.drawable.gray);
                    b_.B86.setBackgroundResource(R.drawable.gray);b_.B87.setBackgroundResource(R.drawable.gray);b_.B88.setBackgroundResource(R.drawable.gray);b_.B89.setBackgroundResource(R.drawable.gray);b_.B90.setBackgroundResource(R.drawable.gray);
                    b_.B81.text==""; b_.B82.text==""; b_.B83.text==""; b_.B84.text==""; b_.B85.text==""; b_.B86.text==""; b_.B87.text==""; b_.B88.text==""; b_.B89.text==""; b_.B90.text==""
                }
                lines=9}
            if(lines==9){

                if (b_.B51.text=="" && b_.B52.text=="" && b_.B53.text=="" && b_.B54.text=="" && b_.B55.text=="" && b_.B56.text=="" && b_.B57.text==""  && b_.B58.text=="" && b_.B59.text=="" && b_.B60.text==""){
                    b_.B51.text==b_.B41.text; b_.B52.text==b_.B42.text; b_.B53.text==b_.B43.text; b_.B54.text==b_.B44.text; b_.B55.text==b_.B45.text;
                    b_.B56.text==b_.B46.text; b_.B57.text==b_.B47.text; b_.B58.text==b_.B48.text; b_.B59.text==b_.B49.text; b_.B60.text==b_.B50.text;
                    b_.B51.background=b_.B41.background; b_.B52.background=b_.B42.background; b_.B53.background=b_.B43.background; b_.B54.background=b_.B44.background; b_.B55.background=b_.B45.background;
                    b_.B56.background=b_.B46.background; b_.B57.background= b_.B47.background; b_.B58.background= b_.B48.background; b_.B59.background=b_.B49.background; b_.B60.background=b_.B50.background;
                    b_.B41.setBackgroundResource(R.drawable.gray);b_.B42.setBackgroundResource(R.drawable.gray);b_.B43.setBackgroundResource(R.drawable.gray);b_.B44.setBackgroundResource(R.drawable.gray);b_.B45.setBackgroundResource(R.drawable.gray);
                    b_.B46.setBackgroundResource(R.drawable.gray);b_.B47.setBackgroundResource(R.drawable.gray);b_.B48.setBackgroundResource(R.drawable.gray);b_.B49.setBackgroundResource(R.drawable.gray);b_.B50.setBackgroundResource(R.drawable.gray);
                    b_.B41.text==""; b_.B42.text==""; b_.B43.text==""; b_.B44.text==""; b_.B45.text==""; b_.B46.text==""; b_.B47.text==""; b_.B48.text==""; b_.B49.text==""; b_.B50.text==""
                }

                if (b_.B61.text=="" && b_.B62.text=="" && b_.B63.text=="" && b_.B64.text=="" && b_.B65.text=="" && b_.B66.text=="" && b_.B67.text==""  && b_.B68.text=="" && b_.B69.text=="" && b_.B70.text==""){
                    b_.B61.text==b_.B51.text; b_.B62.text==b_.B52.text; b_.B63.text==b_.B53.text; b_.B64.text==b_.B54.text; b_.B65.text==b_.B55.text;
                    b_.B66.text==b_.B56.text; b_.B67.text==b_.B57.text; b_.B68.text==b_.B58.text; b_.B69.text==b_.B59.text; b_.B70.text==b_.B60.text;
                    b_.B61.background=b_.B51.background; b_.B62.background=b_.B52.background; b_.B63.background=b_.B53.background; b_.B64.background=b_.B54.background; b_.B65.background=b_.B55.background;
                    b_.B66.background=b_.B56.background; b_.B67.background= b_.B57.background; b_.B68.background= b_.B58.background; b_.B69.background=b_.B59.background; b_.B70.background=b_.B60.background;
                    b_.B51.setBackgroundResource(R.drawable.gray);b_.B52.setBackgroundResource(R.drawable.gray);b_.B53.setBackgroundResource(R.drawable.gray);b_.B54.setBackgroundResource(R.drawable.gray);b_.B55.setBackgroundResource(R.drawable.gray);
                    b_.B56.setBackgroundResource(R.drawable.gray);b_.B57.setBackgroundResource(R.drawable.gray);b_.B58.setBackgroundResource(R.drawable.gray);b_.B59.setBackgroundResource(R.drawable.gray);b_.B60.setBackgroundResource(R.drawable.gray);
                    b_.B51.text==""; b_.B52.text==""; b_.B53.text==""; b_.B54.text==""; b_.B55.text==""; b_.B56.text==""; b_.B57.text==""; b_.B58.text==""; b_.B59.text==""; b_.B60.text==""
                }

                if (b_.B71.text=="" && b_.B72.text=="" && b_.B73.text=="" && b_.B74.text=="" && b_.B75.text=="" && b_.B76.text=="" && b_.B77.text==""  && b_.B78.text=="" && b_.B79.text=="" && b_.B80.text==""){
                    b_.B71.text==b_.B61.text; b_.B72.text==b_.B62.text; b_.B73.text==b_.B63.text; b_.B74.text==b_.B64.text; b_.B75.text==b_.B65.text;
                    b_.B76.text==b_.B66.text; b_.B77.text==b_.B67.text; b_.B78.text==b_.B68.text; b_.B79.text==b_.B69.text; b_.B80.text==b_.B70.text;
                    b_.B71.background=b_.B61.background; b_.B72.background=b_.B62.background; b_.B73.background=b_.B63.background; b_.B74.background=b_.B64.background; b_.B75.background=b_.B65.background;
                    b_.B76.background=b_.B66.background; b_.B77.background= b_.B67.background; b_.B78.background= b_.B68.background; b_.B79.background=b_.B69.background; b_.B80.background=b_.B70.background;
                    b_.B61.setBackgroundResource(R.drawable.gray);b_.B62.setBackgroundResource(R.drawable.gray);b_.B63.setBackgroundResource(R.drawable.gray);b_.B64.setBackgroundResource(R.drawable.gray);b_.B65.setBackgroundResource(R.drawable.gray);
                    b_.B66.setBackgroundResource(R.drawable.gray);b_.B67.setBackgroundResource(R.drawable.gray);b_.B68.setBackgroundResource(R.drawable.gray);b_.B69.setBackgroundResource(R.drawable.gray);b_.B70.setBackgroundResource(R.drawable.gray);
                    b_.B61.text==""; b_.B62.text==""; b_.B63.text==""; b_.B64.text==""; b_.B65.text==""; b_.B66.text==""; b_.B67.text==""; b_.B68.text==""; b_.B69.text==""; b_.B70.text==""
                }


                if (b_.B81.text=="" && b_.B82.text=="" && b_.B83.text=="" && b_.B84.text=="" && b_.B85.text=="" && b_.B86.text=="" && b_.B87.text==""  && b_.B88.text=="" && b_.B89.text=="" && b_.B90.text==""){
                    b_.B81.text==b_.B71.text; b_.B82.text==b_.B72.text; b_.B83.text==b_.B73.text; b_.B84.text==b_.B74.text; b_.B85.text==b_.B75.text;
                    b_.B86.text==b_.B76.text; b_.B87.text==b_.B77.text; b_.B88.text==b_.B78.text; b_.B89.text==b_.B79.text; b_.B90.text==b_.B80.text;
                    b_.B81.background=b_.B71.background; b_.B82.background=b_.B72.background; b_.B83.background=b_.B73.background; b_.B84.background=b_.B74.background; b_.B85.background=b_.B75.background;
                    b_.B86.background=b_.B76.background; b_.B87.background= b_.B77.background; b_.B88.background= b_.B78.background; b_.B89.background=b_.B79.background; b_.B90.background=b_.B80.background;
                    b_.B71.setBackgroundResource(R.drawable.gray);b_.B72.setBackgroundResource(R.drawable.gray);b_.B73.setBackgroundResource(R.drawable.gray);b_.B74.setBackgroundResource(R.drawable.gray);b_.B75.setBackgroundResource(R.drawable.gray);
                    b_.B76.setBackgroundResource(R.drawable.gray);b_.B77.setBackgroundResource(R.drawable.gray);b_.B78.setBackgroundResource(R.drawable.gray);b_.B79.setBackgroundResource(R.drawable.gray);b_.B80.setBackgroundResource(R.drawable.gray);
                    b_.B71.text==""; b_.B72.text==""; b_.B73.text==""; b_.B74.text==""; b_.B75.text==""; b_.B76.text==""; b_.B77.text==""; b_.B78.text==""; b_.B79.text==""; b_.B80.text==""
                }
                lines=8}
            if(lines==8){

                if (b_.B41.text=="" && b_.B42.text=="" && b_.B43.text=="" && b_.B44.text=="" && b_.B45.text=="" && b_.B46.text=="" && b_.B47.text==""  && b_.B48.text=="" && b_.B49.text=="" && b_.B50.text==""){
                    b_.B41.text==b_.B31.text; b_.B42.text==b_.B32.text; b_.B43.text==b_.B33.text; b_.B44.text==b_.B34.text; b_.B45.text==b_.B35.text;
                    b_.B46.text==b_.B36.text; b_.B47.text==b_.B37.text; b_.B48.text==b_.B38.text; b_.B49.text==b_.B39.text; b_.B50.text==b_.B40.text;
                    b_.B41.background=b_.B31.background; b_.B42.background=b_.B32.background; b_.B43.background=b_.B33.background; b_.B44.background=b_.B34.background; b_.B45.background=b_.B35.background;
                    b_.B46.background=b_.B36.background; b_.B47.background= b_.B37.background; b_.B48.background= b_.B38.background; b_.B49.background=b_.B39.background; b_.B50.background=b_.B40.background;
                    b_.B31.setBackgroundResource(R.drawable.gray);b_.B32.setBackgroundResource(R.drawable.gray);b_.B33.setBackgroundResource(R.drawable.gray);b_.B34.setBackgroundResource(R.drawable.gray);b_.B35.setBackgroundResource(R.drawable.gray);
                    b_.B36.setBackgroundResource(R.drawable.gray);b_.B37.setBackgroundResource(R.drawable.gray);b_.B38.setBackgroundResource(R.drawable.gray);b_.B39.setBackgroundResource(R.drawable.gray);b_.B40.setBackgroundResource(R.drawable.gray);
                    b_.B31.text==""; b_.B32.text==""; b_.B33.text==""; b_.B34.text==""; b_.B35.text==""; b_.B36.text==""; b_.B37.text==""; b_.B38.text==""; b_.B39.text==""; b_.B40.text==""
                }

                if (b_.B51.text=="" && b_.B52.text=="" && b_.B53.text=="" && b_.B54.text=="" && b_.B55.text=="" && b_.B56.text=="" && b_.B57.text==""  && b_.B58.text=="" && b_.B59.text=="" && b_.B60.text==""){
                    b_.B51.text==b_.B41.text; b_.B52.text==b_.B42.text; b_.B53.text==b_.B43.text; b_.B54.text==b_.B44.text; b_.B55.text==b_.B45.text;
                    b_.B56.text==b_.B46.text; b_.B57.text==b_.B47.text; b_.B58.text==b_.B48.text; b_.B59.text==b_.B49.text; b_.B60.text==b_.B50.text;
                    b_.B51.background=b_.B41.background; b_.B52.background=b_.B42.background; b_.B53.background=b_.B43.background; b_.B54.background=b_.B44.background; b_.B55.background=b_.B45.background;
                    b_.B56.background=b_.B46.background; b_.B57.background= b_.B47.background; b_.B58.background= b_.B48.background; b_.B59.background=b_.B49.background; b_.B60.background=b_.B50.background;
                    b_.B41.setBackgroundResource(R.drawable.gray);b_.B42.setBackgroundResource(R.drawable.gray);b_.B43.setBackgroundResource(R.drawable.gray);b_.B44.setBackgroundResource(R.drawable.gray);b_.B45.setBackgroundResource(R.drawable.gray);
                    b_.B46.setBackgroundResource(R.drawable.gray);b_.B47.setBackgroundResource(R.drawable.gray);b_.B48.setBackgroundResource(R.drawable.gray);b_.B49.setBackgroundResource(R.drawable.gray);b_.B50.setBackgroundResource(R.drawable.gray);
                    b_.B41.text==""; b_.B42.text==""; b_.B43.text==""; b_.B44.text==""; b_.B45.text==""; b_.B46.text==""; b_.B47.text==""; b_.B48.text==""; b_.B49.text==""; b_.B50.text==""
                }

                if (b_.B61.text=="" && b_.B62.text=="" && b_.B63.text=="" && b_.B64.text=="" && b_.B65.text=="" && b_.B66.text=="" && b_.B67.text==""  && b_.B68.text=="" && b_.B69.text=="" && b_.B70.text==""){
                    b_.B61.text==b_.B51.text; b_.B62.text==b_.B52.text; b_.B63.text==b_.B53.text; b_.B64.text==b_.B54.text; b_.B65.text==b_.B55.text;
                    b_.B66.text==b_.B56.text; b_.B67.text==b_.B57.text; b_.B68.text==b_.B58.text; b_.B69.text==b_.B59.text; b_.B70.text==b_.B60.text;
                    b_.B61.background=b_.B51.background; b_.B62.background=b_.B52.background; b_.B63.background=b_.B53.background; b_.B64.background=b_.B54.background; b_.B65.background=b_.B55.background;
                    b_.B66.background=b_.B56.background; b_.B67.background= b_.B57.background; b_.B68.background= b_.B58.background; b_.B69.background=b_.B59.background; b_.B70.background=b_.B60.background;
                    b_.B51.setBackgroundResource(R.drawable.gray);b_.B52.setBackgroundResource(R.drawable.gray);b_.B53.setBackgroundResource(R.drawable.gray);b_.B54.setBackgroundResource(R.drawable.gray);b_.B55.setBackgroundResource(R.drawable.gray);
                    b_.B56.setBackgroundResource(R.drawable.gray);b_.B57.setBackgroundResource(R.drawable.gray);b_.B58.setBackgroundResource(R.drawable.gray);b_.B59.setBackgroundResource(R.drawable.gray);b_.B60.setBackgroundResource(R.drawable.gray);
                    b_.B51.text==""; b_.B52.text==""; b_.B53.text==""; b_.B54.text==""; b_.B55.text==""; b_.B56.text==""; b_.B57.text==""; b_.B58.text==""; b_.B59.text==""; b_.B60.text==""
                }

                if (b_.B71.text=="" && b_.B72.text=="" && b_.B73.text=="" && b_.B74.text=="" && b_.B75.text=="" && b_.B76.text=="" && b_.B77.text==""  && b_.B78.text=="" && b_.B79.text=="" && b_.B80.text==""){
                    b_.B71.text==b_.B61.text; b_.B72.text==b_.B62.text; b_.B73.text==b_.B63.text; b_.B74.text==b_.B64.text; b_.B75.text==b_.B65.text;
                    b_.B76.text==b_.B66.text; b_.B77.text==b_.B67.text; b_.B78.text==b_.B68.text; b_.B79.text==b_.B69.text; b_.B80.text==b_.B70.text;
                    b_.B71.background=b_.B61.background; b_.B72.background=b_.B62.background; b_.B73.background=b_.B63.background; b_.B74.background=b_.B64.background; b_.B75.background=b_.B65.background;
                    b_.B76.background=b_.B66.background; b_.B77.background= b_.B67.background; b_.B78.background= b_.B68.background; b_.B79.background=b_.B69.background; b_.B80.background=b_.B70.background;
                    b_.B61.setBackgroundResource(R.drawable.gray);b_.B62.setBackgroundResource(R.drawable.gray);b_.B63.setBackgroundResource(R.drawable.gray);b_.B64.setBackgroundResource(R.drawable.gray);b_.B65.setBackgroundResource(R.drawable.gray);
                    b_.B66.setBackgroundResource(R.drawable.gray);b_.B67.setBackgroundResource(R.drawable.gray);b_.B68.setBackgroundResource(R.drawable.gray);b_.B69.setBackgroundResource(R.drawable.gray);b_.B70.setBackgroundResource(R.drawable.gray);
                    b_.B61.text==""; b_.B62.text==""; b_.B63.text==""; b_.B64.text==""; b_.B65.text==""; b_.B66.text==""; b_.B67.text==""; b_.B68.text==""; b_.B69.text==""; b_.B70.text==""
                }
                lines=7}



            if(lines==7){
            //TODO: THIS ONE HAS ERROR

//                if(b_.B31.text=="" && b_.B32.text=="" && b_.B33.text=="" && b_.B34.text=="" && b_.B35.text=="" && b_.B36.text=="" && b_.B37.text==""  && b_.B38.text=="" && b_.B39.text=="" && b_.B40.text==""){
//                    b_.B31.text=b_.B21.text; b_.B32.text=b_.B22.text; b_.B33.text=b_.B23.text; b_.B34.text=b_.B24.text; b_.B35.text=b_.B25.text;
//                    b_.B36.text=b_.B26.text; b_.B37.text=b_.B27.text; b_.B38.text=b_.B28.text; b_.B39.text=b_.B29.text; b_.B40.text=b_.B50.text;
//                    b_.B31.background=b_.B21.background; b_.B32.background=b_.B22.background; b_.B33.background=b_.B23.background; b_.B34.background=b_.B24.background; b_.B35.background=b_.B25.background;
//                    b_.B36.background=b_.B26.background; b_.B37.background= b_.B27.background; b_.B38.background= b_.B28.background; b_.B39.background=b_.B29.background; b_.B40.background=b_.B50.background;
//                    b_.B21.setBackgroundResource(R.drawable.gray);b_.B22.setBackgroundResource(R.drawable.gray);b_.B23.setBackgroundResource(R.drawable.gray);b_.B24.setBackgroundResource(R.drawable.gray);b_.B25.setBackgroundResource(R.drawable.gray);
//                    b_.B26.setBackgroundResource(R.drawable.gray);b_.B27.setBackgroundResource(R.drawable.gray);b_.B28.setBackgroundResource(R.drawable.gray);b_.B29.setBackgroundResource(R.drawable.gray);b_.B30.setBackgroundResource(R.drawable.gray);
//                    b_.B21.text=""; b_.B22.text=""; b_.B23.text=""; b_.B24.text=""; b_.B25.text=""; b_.B26.text=""; b_.B27.text=""; b_.B28.text=""; b_.B29.text=""; b_.B30.text=""
//                }

//                if (b_.B41.text=="" && b_.B42.text=="" && b_.B43.text=="" && b_.B44.text=="" && b_.B45.text=="" && b_.B46.text=="" && b_.B47.text==""  && b_.B48.text=="" && b_.B49.text=="" && b_.B50.text==""){
//                    b_.B41.text=b_.B31.text; b_.B42.text=b_.B32.text; b_.B43.text=b_.B33.text; b_.B44.text=b_.B34.text; b_.B45.text=b_.B35.text;
//                    b_.B46.text=b_.B36.text; b_.B47.text=b_.B37.text; b_.B48.text=b_.B38.text; b_.B49.text=b_.B39.text; b_.B50.text=b_.B40.text;
//                    b_.B41.background=b_.B31.background; b_.B42.background=b_.B32.background; b_.B43.background=b_.B33.background; b_.B44.background=b_.B34.background; b_.B45.background=b_.B35.background;
//                    b_.B46.background=b_.B36.background; b_.B47.background= b_.B37.background; b_.B48.background= b_.B38.background; b_.B49.background=b_.B39.background; b_.B50.background=b_.B40.background;
//                    b_.B31.setBackgroundResource(R.drawable.gray);b_.B32.setBackgroundResource(R.drawable.gray);b_.B33.setBackgroundResource(R.drawable.gray);b_.B34.setBackgroundResource(R.drawable.gray);b_.B35.setBackgroundResource(R.drawable.gray);
//                    b_.B36.setBackgroundResource(R.drawable.gray);b_.B37.setBackgroundResource(R.drawable.gray);b_.B38.setBackgroundResource(R.drawable.gray);b_.B39.setBackgroundResource(R.drawable.gray);b_.B40.setBackgroundResource(R.drawable.gray);
//                    b_.B31.text=""; b_.B32.text=""; b_.B33.text=""; b_.B34.text=""; b_.B35.text=""; b_.B36.text=""; b_.B37.text=""; b_.B38.text=""; b_.B39.text=""; b_.B40.text=""
//                }
//
//                if (b_.B51.text=="" && b_.B52.text=="" && b_.B53.text=="" && b_.B54.text=="" && b_.B55.text=="" && b_.B56.text=="" && b_.B57.text==""  && b_.B58.text=="" && b_.B59.text=="" && b_.B60.text==""){
//                    b_.B51.text=b_.B41.text; b_.B52.text=b_.B42.text; b_.B53.text=b_.B43.text; b_.B54.text=b_.B44.text; b_.B55.text=b_.B45.text;
//                    b_.B56.text=b_.B46.text; b_.B57.text=b_.B47.text; b_.B58.text=b_.B48.text; b_.B59.text=b_.B49.text; b_.B60.text=b_.B50.text;
//                    b_.B51.background=b_.B41.background; b_.B52.background=b_.B42.background; b_.B53.background=b_.B43.background; b_.B54.background=b_.B44.background; b_.B55.background=b_.B45.background;
//                    b_.B56.background=b_.B46.background; b_.B57.background= b_.B47.background; b_.B58.background= b_.B48.background; b_.B59.background=b_.B49.background; b_.B60.background=b_.B50.background;
//                    b_.B41.setBackgroundResource(R.drawable.gray);b_.B42.setBackgroundResource(R.drawable.gray);b_.B43.setBackgroundResource(R.drawable.gray);b_.B44.setBackgroundResource(R.drawable.gray);b_.B45.setBackgroundResource(R.drawable.gray);
//                    b_.B46.setBackgroundResource(R.drawable.gray);b_.B47.setBackgroundResource(R.drawable.gray);b_.B48.setBackgroundResource(R.drawable.gray);b_.B49.setBackgroundResource(R.drawable.gray);b_.B50.setBackgroundResource(R.drawable.gray);
//                    b_.B41.text=""; b_.B42.text=""; b_.B43.text=""; b_.B44.text=""; b_.B45.text=""; b_.B46.text=""; b_.B47.text=""; b_.B48.text=""; b_.B49.text=""; b_.B50.text=""
//                }
//
//                if (b_.B61.text=="" && b_.B62.text=="" && b_.B63.text=="" && b_.B64.text=="" && b_.B65.text=="" && b_.B66.text=="" && b_.B67.text==""  && b_.B68.text=="" && b_.B69.text=="" && b_.B70.text==""){
//                    b_.B61.text=b_.B51.text; b_.B62.text=b_.B52.text; b_.B63.text=b_.B53.text; b_.B64.text=b_.B54.text; b_.B65.text=b_.B55.text;
//                    b_.B66.text=b_.B56.text; b_.B67.text=b_.B57.text; b_.B68.text=b_.B58.text; b_.B69.text=b_.B59.text; b_.B70.text=b_.B60.text;
//                    b_.B61.background=b_.B51.background; b_.B62.background=b_.B52.background; b_.B63.background=b_.B53.background; b_.B64.background=b_.B54.background; b_.B65.background=b_.B55.background;
//                    b_.B66.background=b_.B56.background; b_.B67.background= b_.B57.background; b_.B68.background= b_.B58.background; b_.B69.background=b_.B59.background; b_.B70.background=b_.B60.background;
//                    b_.B51.setBackgroundResource(R.drawable.gray);b_.B52.setBackgroundResource(R.drawable.gray);b_.B53.setBackgroundResource(R.drawable.gray);b_.B54.setBackgroundResource(R.drawable.gray);b_.B55.setBackgroundResource(R.drawable.gray);
//                    b_.B56.setBackgroundResource(R.drawable.gray);b_.B57.setBackgroundResource(R.drawable.gray);b_.B58.setBackgroundResource(R.drawable.gray);b_.B59.setBackgroundResource(R.drawable.gray);b_.B60.setBackgroundResource(R.drawable.gray);
//                    b_.B51.text=""; b_.B52.text=""; b_.B53.text=""; b_.B54.text=""; b_.B55.text=""; b_.B56.text=""; b_.B57.text=""; b_.B58.text=""; b_.B59.text=""; b_.B60.text=""
//                }
                lines=6
            }


            if(lines==6){
                if(b_.B51.text=="" && b_.B52.text=="" && b_.B53.text=="" && b_.B54.text=="" && b_.B55.text=="" && b_.B56.text=="" && b_.B57.text==""  && b_.B58.text=="" && b_.B59.text=="" && b_.B60.text==""){
                    b_.B51.text==b_.B41.text; b_.B52.text==b_.B42.text; b_.B53.text==b_.B43.text; b_.B54.text==b_.B44.text; b_.B55.text==b_.B45.text;
                    b_.B56.text==b_.B46.text; b_.B57.text==b_.B47.text; b_.B58.text==b_.B48.text; b_.B59.text==b_.B49.text; b_.B60.text==b_.B50.text;
                    b_.B51.background=b_.B41.background; b_.B52.background=b_.B42.background; b_.B53.background=b_.B43.background; b_.B54.background=b_.B44.background; b_.B55.background=b_.B45.background;
                    b_.B56.background=b_.B46.background; b_.B57.background= b_.B47.background; b_.B58.background= b_.B48.background; b_.B59.background=b_.B49.background; b_.B60.background=b_.B50.background;
                    b_.B41.setBackgroundResource(R.drawable.gray);b_.B42.setBackgroundResource(R.drawable.gray);b_.B43.setBackgroundResource(R.drawable.gray);b_.B44.setBackgroundResource(R.drawable.gray);b_.B45.setBackgroundResource(R.drawable.gray);
                    b_.B46.setBackgroundResource(R.drawable.gray);b_.B47.setBackgroundResource(R.drawable.gray);b_.B48.setBackgroundResource(R.drawable.gray);b_.B49.setBackgroundResource(R.drawable.gray);b_.B50.setBackgroundResource(R.drawable.gray);
                    b_.B41.text==""; b_.B42.text==""; b_.B43.text==""; b_.B44.text==""; b_.B45.text==""; b_.B46.text==""; b_.B47.text==""; b_.B48.text==""; b_.B49.text==""; b_.B50.text=="" }
                lines=5}
            if(lines==5){
                if(b_.B41.text=="" && b_.B42.text=="" && b_.B43.text=="" && b_.B44.text=="" && b_.B45.text=="" && b_.B46.text=="" && b_.B47.text==""  && b_.B48.text=="" && b_.B49.text=="" && b_.B50.text==""){
                    b_.B41.text==b_.B31.text; b_.B42.text==b_.B32.text; b_.B43.text==b_.B33.text; b_.B44.text==b_.B34.text; b_.B45.text==b_.B35.text;
                    b_.B46.text==b_.B36.text; b_.B47.text==b_.B37.text; b_.B48.text==b_.B38.text; b_.B49.text==b_.B39.text; b_.B50.text==b_.B40.text;
                    b_.B41.background=b_.B31.background; b_.B42.background=b_.B32.background; b_.B43.background=b_.B33.background; b_.B44.background=b_.B34.background; b_.B45.background=b_.B35.background;
                    b_.B46.background=b_.B36.background; b_.B47.background= b_.B37.background; b_.B48.background= b_.B38.background; b_.B49.background=b_.B39.background; b_.B50.background=b_.B40.background;
                    b_.B31.setBackgroundResource(R.drawable.gray);b_.B32.setBackgroundResource(R.drawable.gray);b_.B33.setBackgroundResource(R.drawable.gray);b_.B34.setBackgroundResource(R.drawable.gray);b_.B35.setBackgroundResource(R.drawable.gray);
                    b_.B36.setBackgroundResource(R.drawable.gray);b_.B37.setBackgroundResource(R.drawable.gray);b_.B38.setBackgroundResource(R.drawable.gray);b_.B39.setBackgroundResource(R.drawable.gray);b_.B40.setBackgroundResource(R.drawable.gray);
                    b_.B31.text==""; b_.B32.text==""; b_.B33.text==""; b_.B34.text==""; b_.B35.text==""; b_.B36.text==""; b_.B37.text==""; b_.B38.text==""; b_.B39.text==""; b_.B40.text==""
                }
                lines=4}


            if(lines==4){if(b_.B31.text=="" && b_.B32.text=="" && b_.B33.text=="" && b_.B34.text=="" && b_.B35.text=="" && b_.B36.text=="" && b_.B37.text==""  && b_.B38.text=="" && b_.B39.text=="" && b_.B40.text==""){
                b_.B31.text==b_.B21.text; b_.B32.text==b_.B22.text; b_.B33.text==b_.B23.text; b_.B34.text==b_.B24.text; b_.B35.text==b_.B25.text;
                b_.B36.text==b_.B26.text; b_.B37.text==b_.B27.text; b_.B38.text==b_.B28.text; b_.B39.text==b_.B29.text; b_.B40.text==b_.B50.text;
                b_.B31.background=b_.B21.background; b_.B32.background=b_.B22.background; b_.B33.background=b_.B23.background; b_.B34.background=b_.B24.background; b_.B35.background=b_.B25.background;
                b_.B36.background=b_.B26.background; b_.B37.background= b_.B27.background; b_.B38.background= b_.B28.background; b_.B39.background=b_.B29.background; b_.B40.background=b_.B50.background;
                b_.B21.setBackgroundResource(R.drawable.gray);b_.B22.setBackgroundResource(R.drawable.gray);b_.B23.setBackgroundResource(R.drawable.gray);b_.B24.setBackgroundResource(R.drawable.gray);b_.B25.setBackgroundResource(R.drawable.gray);
                b_.B26.setBackgroundResource(R.drawable.gray);b_.B27.setBackgroundResource(R.drawable.gray);b_.B28.setBackgroundResource(R.drawable.gray);b_.B29.setBackgroundResource(R.drawable.gray);b_.B30.setBackgroundResource(R.drawable.gray);
                b_.B21.text==""; b_.B22.text==""; b_.B23.text==""; b_.B24.text==""; b_.B25.text==""; b_.B26.text==""; b_.B27.text==""; b_.B28.text==""; b_.B29.text==""; b_.B30.text==""

            }
                lines=3}
            if(lines==3){lines=2}
            if(lines==2){}


        },500)
        b_.pointTally.text=="Points: $points"
    }


    private fun next_shape(){

        b_.b1.setBackgroundResource(R.drawable.gray);b_.b2.setBackgroundResource(R.drawable.gray);b_.b3.setBackgroundResource(R.drawable.gray);b_.b4.setBackgroundResource(R.drawable.gray);
        b_.b5.setBackgroundResource(R.drawable.gray);b_.b6.setBackgroundResource(R.drawable.gray);b_.b7.setBackgroundResource(R.drawable.gray);b_.b8.setBackgroundResource(R.drawable.gray);
        b_.b9.setBackgroundResource(R.drawable.gray);b_.b10.setBackgroundResource(R.drawable.gray);b_.b11.setBackgroundResource(R.drawable.gray);b_.b12.setBackgroundResource(R.drawable.gray);
        val random = Random.nextInt(1..7)

        when (random)

        {
            1 -> {b_.b9.setBackgroundResource(R.drawable.red_block);b_.b10.setBackgroundResource(R.drawable.red_block);b_.b11.setBackgroundResource(R.drawable.red_block);b_.b12.setBackgroundResource(R.drawable.red_block);}
            2->  {b_.b7.setBackgroundResource(R.drawable.orange_block);b_.b8.setBackgroundResource(R.drawable.orange_block);b_.b11.setBackgroundResource(R.drawable.orange_block);b_.b12.setBackgroundResource(R.drawable.orange_block)}
            3 -> {b_.b8.setBackgroundResource(R.drawable.yellow_block);b_.b9.setBackgroundResource(R.drawable.yellow_block);b_.b11.setBackgroundResource(R.drawable.yellow_block);b_.b12.setBackgroundResource(R.drawable.yellow_block);}
            4 -> {b_.b7.setBackgroundResource(R.drawable.green_block);b_.b10.setBackgroundResource(R.drawable.green_block);b_.b11.setBackgroundResource(R.drawable.green_block);b_.b12.setBackgroundResource(R.drawable.green_block);}
            5 -> {b_.b9.setBackgroundResource(R.drawable.blue_block);b_.b8.setBackgroundResource(R.drawable.blue_block);b_.b11.setBackgroundResource(R.drawable.blue_block);b_.b10.setBackgroundResource(R.drawable.blue_block);}
            6 -> {b_.b8.setBackgroundResource(R.drawable.purple_block);b_.b10.setBackgroundResource(R.drawable.purple_block);b_.b11.setBackgroundResource(R.drawable.purple_block);b_.b12.setBackgroundResource(R.drawable.purple_block)}
            7 -> {b_.b2.setBackgroundResource(R.drawable.pink_block);b_.b5.setBackgroundResource(R.drawable.pink_block);b_.b8.setBackgroundResource(R.drawable.pink_block);b_.b11.setBackgroundResource(R.drawable.pink_block)}
        }

        nextUp = random
        if(once == 0){
            b_.b1.setBackgroundResource(R.drawable.gray);b_.b2.setBackgroundResource(R.drawable.gray);b_.b3.setBackgroundResource(R.drawable.gray);b_.b4.setBackgroundResource(R.drawable.gray);
            b_.b5.setBackgroundResource(R.drawable.gray);b_.b6.setBackgroundResource(R.drawable.gray);b_.b7.setBackgroundResource(R.drawable.gray);b_.b8.setBackgroundResource(R.drawable.gray);
            b_.b9.setBackgroundResource(R.drawable.gray);b_.b10.setBackgroundResource(R.drawable.gray);b_.b11.setBackgroundResource(R.drawable.gray);b_.b12.setBackgroundResource(R.drawable.gray);
            b_.b8.setBackgroundResource(R.drawable.yellow_block);b_.b9.setBackgroundResource(R.drawable.yellow_block);b_.b11.setBackgroundResource(R.drawable.yellow_block);b_.b12.setBackgroundResource(R.drawable.yellow_block)

            nextUp =3
            once =1
        }

        if( starting == 0)
        {
            Handler().postDelayed({shapes()},1500)
            starting = 1
        }

    }






    private fun shapes() {
        if (b_.B11.text == "0" || b_.B12.text == "0" || b_.B13.text == "0" || b_.B14.text == "0" || b_.B15.text == "0" || b_.B16.text == "0" || b_.B17.text == "0" || b_.B18.text == "0" || b_.B19.text == "0" || b_.B20.text == "0") {
            b_.b1.setBackgroundResource(R.drawable.gray);b_.b2.setBackgroundResource(R.drawable.gray);b_.b3.setBackgroundResource(R.drawable.gray);b_.b4.setBackgroundResource(R.drawable.gray);
            b_.b5.setBackgroundResource(R.drawable.gray);b_.b6.setBackgroundResource(R.drawable.gray);b_.b7.setBackgroundResource(R.drawable.gray);b_.b8.setBackgroundResource(R.drawable.gray);
            b_.b9.setBackgroundResource(R.drawable.gray);b_.b10.setBackgroundResource(R.drawable.gray);b_.b11.setBackgroundResource(R.drawable.gray);b_.b12.setBackgroundResource(R.drawable.gray);
            b_.b8.setBackgroundResource(R.drawable.pink_block);b_.b9.setBackgroundResource(R.drawable.pink_block);b_.b11.setBackgroundResource(R.drawable.pink_block);b_.b12.setBackgroundResource(R.drawable.pink_block)
        }

        lose_a_line()
        if (stop == 0) {

            a=0;b=0;z=0;x=0

            if(b_.B24.text == "0" || b_.B25.text == "0" || b_.B26.text == "0" || b_.B27.text == "0"){nextUp=7}
            array.removeAll(array);arrayCollectionPreviousOne.removeAll(arrayCollectionPreviousOne)
            shape_is =nextUp
            next_shape()
            when(shape_is){

                1 -> {b_.B6.setBackgroundResource(R.drawable.red_block);b_.B14.setBackgroundResource(R.drawable.red_block);b_.B15.setBackgroundResource(R.drawable.red_block);b_.B16.setBackgroundResource(R.drawable.red_block);}
                2->  {b_.B5.setBackgroundResource(R.drawable.orange_block);b_.B6.setBackgroundResource(R.drawable.orange_block);b_.B16.setBackgroundResource(R.drawable.orange_block);b_.B17.setBackgroundResource(R.drawable.orange_block)}
                3 -> {b_.B5.setBackgroundResource(R.drawable.yellow_block);b_.B6.setBackgroundResource(R.drawable.yellow_block);b_.B15.setBackgroundResource(R.drawable.yellow_block);b_.B16.setBackgroundResource(R.drawable.yellow_block);}
                4 -> {b_.B5.setBackgroundResource(R.drawable.green_block);b_.B15.setBackgroundResource(R.drawable.green_block);b_.B16.setBackgroundResource(R.drawable.green_block);b_.B17.setBackgroundResource(R.drawable.green_block);}
                5 -> {b_.B5.setBackgroundResource(R.drawable.blue_block);b_.B6.setBackgroundResource(R.drawable.blue_block);b_.B14.setBackgroundResource(R.drawable.blue_block);b_.B15.setBackgroundResource(R.drawable.blue_block);}
                6 -> {b_.B6.setBackgroundResource(R.drawable.purple_block);b_.B15.setBackgroundResource(R.drawable.purple_block);b_.B16.setBackgroundResource(R.drawable.purple_block);b_.B17.setBackgroundResource(R.drawable.purple_block)}
                7 -> {b_.B4.setBackgroundResource(R.drawable.pink_block);b_.B5.setBackgroundResource(R.drawable.pink_block);b_.B6.setBackgroundResource(R.drawable.pink_block);b_.B7.setBackgroundResource(R.drawable.pink_block)}

            }
            list()
        }else {}
    }


    private fun list() {

        b_.right.setOnClickListener {
            if (a == 0) {

                if(num1 !=10&& num1 !=20&& num1 !=30&& num1 !=40&& num1 !=50&& num1 !=60&& num1 !=70&& num1 !=80&& num1 !=90&& num1 !=100&& num1 !=110&& num1 !=120&& num1 !=130&& num1 !=140&& num1 !=150&&
                    num2 !=10&& num2 !=20&& num2 !=30&& num2 !=40&& num2 !=50&& num2 !=60&& num2 !=70&& num2 !=80&& num2 !=90&& num2 !=100&& num2 !=110&& num2 !=120&& num2 !=130&& num2 !=140&& num2 !=150&&
                    num3 !=10&& num3 !=20&& num3 !=30&& num3 !=40&& num3 !=50&& num3 !=60&& num3 !=70&& num3 !=80&& num3 !=90&& num3 !=100&& num3 !=110&& num3 !=120&& num3 !=130&& num3 !=140&& num3 !=150&&
                    num4 !=10&& num4 !=20&& num4 !=30&& num4 !=40&& num4 !=50&& num4 !=60&& num4 !=70&& num4 !=80&& num4 !=90&& num4 !=100&& num4 !=110&& num4 !=120&& num4 !=130&& num4 !=140&& num4 !=150
                    &&downArray[num1+1].text==""&&downArray[num2+1].text==""&&downArray[num3+1].text==""&&downArray[num4+1].text==""){num1 +=1; num2 +=1; num3 +=1; num4 +=1} }

        }
        b_.left.setOnClickListener {
            if(b==0)
            {
                if(num1 !=1&& num1 !=11&& num1 !=21&& num1 !=31&& num1 !=41&& num1 !=51&& num1 !=61&& num1 !=71&& num1 !=81&& num1 !=91&& num1 !=101&& num1 !=111&& num1 !=121&& num1 !=131&& num1 !=141&&
                    num2 !=1&& num2 !=11&& num2 !=21&& num2 !=31&& num2 !=41&& num2 !=51&& num2 !=61&& num2 !=71&& num2 !=81&& num2 !=91&& num2 !=101&& num2 !=111&& num2 !=121&& num2 !=131&& num2 !=141&&
                    num3 !=1&& num3 !=11&& num3 !=21&& num3 !=31&& num3 !=41&& num3 !=51&& num3 !=61&& num3 !=71&& num3 !=81&& num3 !=91&& num3 !=101&& num3 !=111&& num3 !=121&& num3 !=131&& num3 !=141&&
                    num4 !=1&& num4 !=11&& num4 !=21&& num4 !=31&& num4 !=41&& num4 !=51&& num4 !=61&& num4 !=71&& num4 !=81&& num4 !=91&& num4 !=101&& num4 !=111&& num4 !=121&& num4 !=131&& num4 !=141
                    &&downArray[num1-1].text==""&&downArray[num2-1].text==""&&downArray[num3-1].text==""&&downArray[num4-1].text==""){num1 -=1; num2 -=1; num3 -=1; num4 -=1}
            }
            b_.rotate.setOnClickListener {
                if (downArray[num1+1].text==""&&downArray[num2+1].text==""&&downArray[num3+1].text==""&&downArray[num4+1].text==""&&
                    downArray[num1-1].text==""&&downArray[num2-1].text==""&&downArray[num3-1].text==""&&downArray[num4-1].text==""&&
                    downArray[num1+10].text==""&&downArray[num2+10].text==""&&downArray[num3+10].text==""&&downArray[num4+10].text==""&&
                    downArray[num1-10].text==""&&downArray[num2-10].text==""&&downArray[num3-10].text==""&&downArray[num4-10].text==""){
                    when (shape_is){

                        1 -> {if(z==0){num1-=1; num2+=1; num3+=10; num4+=10; z=1}; else if (z==1){num1+=9; num2+=0; num3-=9; num4-=2; z=2};
                        else if (z==2){num1-=10; num2-=10; num3-=1; num4+=10; z=3};else{num1+=2; num2+=9; num3+=0; num4-=9; z=0}}
                        2 -> {if(z==0){num1+=1;num2+=9;num3+=0;num4+=8;z=1}else{num1-=1; num2-=9; num3-=0; num4-=8; z=0}}
                        3 -> {}//done
                        4 -> {if(z ==0){num1+=0;num2-=9;num3-=1;num4+=8;z=1};else if(z==1){num1+=10; num2+=10; num3+=2; num4+=2; z=1};
                        else if (z ==2){num1-=8;num2+=1;num3+=9;num4+=0;z=3};else{num1-=2;num2-=2;num3-=10;num4-=10;z=0}}
                        5 -> {if(z ==0){num1+=0;num2+=9;num3+=2;num4+=11;z=1};else {num1-=0;num2-=9;num3-=2;num4-=11;z=0}}
                        6 -> {if(z ==0){num1+=0;num2+=1;num3+=1;num4+=9;z=1}else if(z==1) {num1+=9;num2+=0;num3+=0;num4+=0;z=2}};
                        7 -> {if(z ==0){num1+=1;num2+=10;num3+=19;num4+=28;z=1}else{num1-=1;num2-=10;num3-=19;num4-=28;z=0}}


                    }



                }   }
        }
        b_.down.setOnClickListener {

            while(x==0)
            {
                arrayCollectionPreviousOne.add(downArray[num1]);arrayCollectionPreviousOne.add(downArray[num2]);arrayCollectionPreviousOne.add(downArray[num3]);arrayCollectionPreviousOne.add(downArray[num4])
                num1+=10;num2+=10;num3+=10;num4+=10
                if(downArray[num1].text=="1"||downArray[num2].text=="1"||downArray[num3].text=="1"||downArray[num4].text=="1"||
                    num1==141||num1==142||num1==143||num1==144||num1==145||num1==146||num1==147||num1==148||num1==149||num1==150||
                    num2==141||num2==142||num2==143||num2==144||num2==145||num2==146||num2==147||num2==148||num2==149||num2==150||
                    num3==141||num3==142||num3==143||num3==144||num3==145||num3==146||num3==147||num3==148||num3==149||num3==150||
                    num4==141||num4==142||num4==143||num4==144||num4==145||num4==146||num4==147||num4==148||num4==149||num4==150){
                    num1-=10;num2-=10;num3-=10;num4-=10;x=1;points+=5
                }

            }

            if(a==0||b==0)
            {num1+=10;num2+=10;num3+=10;num4+=10}
            arrayCollectionPreviousOne.add(downArray[num1]);arrayCollectionPreviousOne.add(downArray[num2]);arrayCollectionPreviousOne.add(downArray[num3]);arrayCollectionPreviousOne.add(downArray[num4])
            array.add(downArray[num1]);array.add(downArray[num2]);array.add(downArray[num3]);array.add(downArray[num4])
            landing();colors()

        }
    }


    var x=0
    private fun list2() {
        if (downArray[num1 - 10].text == "") {downArray[num1 - 10].text = "1" } else if (downArray[num1 - 10].text == "0") {}
        if (downArray[num2 - 10].text == "") {downArray[num2 - 10].text = "1" } else if (downArray[num2 - 10].text == "0") {}
        if (downArray[num3 - 10].text == "") {downArray[num3 - 10].text = "1" } else if (downArray[num3 - 10].text == "0") {}
        if (downArray[num4 - 10].text == "") {downArray[num4 - 10].text = "1" } else if (downArray[num4 - 10].text == "0") {}

        shapes()

    }
    private fun R_L(){

        if(b_.B1.text!="0"){b_.B1.setBackgroundResource(R.drawable.gray)};if(b_.B2.text!="0"){b_.B2.setBackgroundResource(R.drawable.gray)};if(b_.B3.text!="0"){b_.B3.setBackgroundResource(R.drawable.gray)};if(b_.B4.text!="0"){b_.B4.setBackgroundResource(R.drawable.gray)};if(b_.B5.text!="0"){b_.B5.setBackgroundResource(R.drawable.gray)};if(b_.B6.text!="0"){b_.B6.setBackgroundResource(R.drawable.gray)};if(b_.B7.text!="0"){b_.B7.setBackgroundResource(R.drawable.gray)};if(b_.B8.text!="0"){b_.B8.setBackgroundResource(R.drawable.gray)};if(b_.B9.text!="0"){b_.B9.setBackgroundResource(R.drawable.gray)};if(b_.B10.text!="0"){b_.B10.setBackgroundResource(R.drawable.gray)};
        if(b_.B11.text!="0"){b_.B11.setBackgroundResource(R.drawable.gray)};if(b_.B12.text!="0"){b_.B12.setBackgroundResource(R.drawable.gray)};if(b_.B13.text!="0"){b_.B13.setBackgroundResource(R.drawable.gray)};if(b_.B14.text!="0"){b_.B14.setBackgroundResource(R.drawable.gray)};if(b_.B15.text!="0"){b_.B15.setBackgroundResource(R.drawable.gray)};if(b_.B16.text!="0"){b_.B16.setBackgroundResource(R.drawable.gray)};if(b_.B17.text!="0"){b_.B17.setBackgroundResource(R.drawable.gray)};if(b_.B18.text!="0"){b_.B18.setBackgroundResource(R.drawable.gray)};if(b_.B19.text!="0"){b_.B19.setBackgroundResource(R.drawable.gray)};if(b_.B20.text!="0"){b_.B20.setBackgroundResource(R.drawable.gray)};
        if(b_.B21.text!="0"){b_.B21.setBackgroundResource(R.drawable.gray)};if(b_.B22.text!="0"){b_.B22.setBackgroundResource(R.drawable.gray)};if(b_.B23.text!="0"){b_.B23.setBackgroundResource(R.drawable.gray)};if(b_.B24.text!="0"){b_.B24.setBackgroundResource(R.drawable.gray)};if(b_.B25.text!="0"){b_.B25.setBackgroundResource(R.drawable.gray)};if(b_.B26.text!="0"){b_.B26.setBackgroundResource(R.drawable.gray)};if(b_.B27.text!="0"){b_.B27.setBackgroundResource(R.drawable.gray)};if(b_.B28.text!="0"){b_.B28.setBackgroundResource(R.drawable.gray)};if(b_.B29.text!="0"){b_.B29.setBackgroundResource(R.drawable.gray)};if(b_.B30.text!="0"){b_.B30.setBackgroundResource(R.drawable.gray)};
        if(b_.B31.text!="0"){b_.B31.setBackgroundResource(R.drawable.gray)};if(b_.B32.text!="0"){b_.B32.setBackgroundResource(R.drawable.gray)};if(b_.B33.text!="0"){b_.B33.setBackgroundResource(R.drawable.gray)};if(b_.B34.text!="0"){b_.B34.setBackgroundResource(R.drawable.gray)};if(b_.B35.text!="0"){b_.B35.setBackgroundResource(R.drawable.gray)};if(b_.B36.text!="0"){b_.B36.setBackgroundResource(R.drawable.gray)};if(b_.B37.text!="0"){b_.B37.setBackgroundResource(R.drawable.gray)};if(b_.B38.text!="0"){b_.B38.setBackgroundResource(R.drawable.gray)};if(b_.B39.text!="0"){b_.B39.setBackgroundResource(R.drawable.gray)};if(b_.B40.text!="0"){b_.B40.setBackgroundResource(R.drawable.gray)};
        if(b_.B41.text!="0"){b_.B41.setBackgroundResource(R.drawable.gray)};if(b_.B42.text!="0"){b_.B42.setBackgroundResource(R.drawable.gray)};if(b_.B43.text!="0"){b_.B43.setBackgroundResource(R.drawable.gray)};if(b_.B44.text!="0"){b_.B44.setBackgroundResource(R.drawable.gray)};if(b_.B45.text!="0"){b_.B45.setBackgroundResource(R.drawable.gray)};if(b_.B46.text!="0"){b_.B46.setBackgroundResource(R.drawable.gray)};if(b_.B47.text!="0"){b_.B47.setBackgroundResource(R.drawable.gray)};if(b_.B48.text!="0"){b_.B48.setBackgroundResource(R.drawable.gray)};if(b_.B49.text!="0"){b_.B49.setBackgroundResource(R.drawable.gray)};if(b_.B50.text!="0"){b_.B50.setBackgroundResource(R.drawable.gray)};
        if(b_.B51.text!="0"){b_.B51.setBackgroundResource(R.drawable.gray)};if(b_.B52.text!="0"){b_.B52.setBackgroundResource(R.drawable.gray)};if(b_.B53.text!="0"){b_.B53.setBackgroundResource(R.drawable.gray)};if(b_.B54.text!="0"){b_.B54.setBackgroundResource(R.drawable.gray)};if(b_.B55.text!="0"){b_.B55.setBackgroundResource(R.drawable.gray)};if(b_.B56.text!="0"){b_.B56.setBackgroundResource(R.drawable.gray)};if(b_.B57.text!="0"){b_.B57.setBackgroundResource(R.drawable.gray)};if(b_.B58.text!="0"){b_.B58.setBackgroundResource(R.drawable.gray)};if(b_.B59.text!="0"){b_.B59.setBackgroundResource(R.drawable.gray)};if(b_.B60.text!="0"){b_.B60.setBackgroundResource(R.drawable.gray)};
        if(b_.B61.text!="0"){b_.B61.setBackgroundResource(R.drawable.gray)};if(b_.B62.text!="0"){b_.B62.setBackgroundResource(R.drawable.gray)};if(b_.B63.text!="0"){b_.B63.setBackgroundResource(R.drawable.gray)};if(b_.B64.text!="0"){b_.B64.setBackgroundResource(R.drawable.gray)};if(b_.B65.text!="0"){b_.B65.setBackgroundResource(R.drawable.gray)};if(b_.B66.text!="0"){b_.B66.setBackgroundResource(R.drawable.gray)};if(b_.B67.text!="0"){b_.B67.setBackgroundResource(R.drawable.gray)};if(b_.B68.text!="0"){b_.B68.setBackgroundResource(R.drawable.gray)};if(b_.B69.text!="0"){b_.B69.setBackgroundResource(R.drawable.gray)};if(b_.B70.text!="0"){b_.B70.setBackgroundResource(R.drawable.gray)};
        if(b_.B71.text!="0"){b_.B71.setBackgroundResource(R.drawable.gray)};if(b_.B72.text!="0"){b_.B72.setBackgroundResource(R.drawable.gray)};if(b_.B73.text!="0"){b_.B73.setBackgroundResource(R.drawable.gray)};if(b_.B74.text!="0"){b_.B74.setBackgroundResource(R.drawable.gray)};if(b_.B75.text!="0"){b_.B75.setBackgroundResource(R.drawable.gray)};if(b_.B76.text!="0"){b_.B76.setBackgroundResource(R.drawable.gray)};if(b_.B77.text!="0"){b_.B77.setBackgroundResource(R.drawable.gray)};if(b_.B78.text!="0"){b_.B78.setBackgroundResource(R.drawable.gray)};if(b_.B79.text!="0"){b_.B79.setBackgroundResource(R.drawable.gray)};if(b_.B80.text!="0"){b_.B80.setBackgroundResource(R.drawable.gray)};
        if(b_.B81.text!="0"){b_.B81.setBackgroundResource(R.drawable.gray)};if(b_.B82.text!="0"){b_.B82.setBackgroundResource(R.drawable.gray)};if(b_.B83.text!="0"){b_.B83.setBackgroundResource(R.drawable.gray)};if(b_.B84.text!="0"){b_.B84.setBackgroundResource(R.drawable.gray)};if(b_.B85.text!="0"){b_.B85.setBackgroundResource(R.drawable.gray)};if(b_.B86.text!="0"){b_.B86.setBackgroundResource(R.drawable.gray)};if(b_.B87.text!="0"){b_.B87.setBackgroundResource(R.drawable.gray)};if(b_.B88.text!="0"){b_.B88.setBackgroundResource(R.drawable.gray)};if(b_.B89.text!="0"){b_.B89.setBackgroundResource(R.drawable.gray)};if(b_.B90.text!="0"){b_.B90.setBackgroundResource(R.drawable.gray)};
        if(b_.B91.text!="0"){b_.B91.setBackgroundResource(R.drawable.gray)};if(b_.B92.text!="0"){b_.B92.setBackgroundResource(R.drawable.gray)};if(b_.B93.text!="0"){b_.B93.setBackgroundResource(R.drawable.gray)};if(b_.B94.text!="0"){b_.B94.setBackgroundResource(R.drawable.gray)};if(b_.B95.text!="0"){b_.B95.setBackgroundResource(R.drawable.gray)};if(b_.B96.text!="0"){b_.B96.setBackgroundResource(R.drawable.gray)};if(b_.B97.text!="0"){b_.B97.setBackgroundResource(R.drawable.gray)};if(b_.B98.text!="0"){b_.B98.setBackgroundResource(R.drawable.gray)};if(b_.B99.text!="0"){b_.B99.setBackgroundResource(R.drawable.gray)};if(b_.B100.text!="0"){b_.B100.setBackgroundResource(R.drawable.gray)};
        if(b_.B101.text!="0"){b_.B101.setBackgroundResource(R.drawable.gray)};if(b_.B102.text!="0"){b_.B102.setBackgroundResource(R.drawable.gray)};if(b_.B103.text!="0"){b_.B103.setBackgroundResource(R.drawable.gray)};if(b_.B104.text!="0"){b_.B104.setBackgroundResource(R.drawable.gray)};if(b_.B105.text!="0"){b_.B105.setBackgroundResource(R.drawable.gray)};if(b_.B106.text!="0"){b_.B106.setBackgroundResource(R.drawable.gray)};if(b_.B107.text!="0"){b_.B107.setBackgroundResource(R.drawable.gray)};if(b_.B108.text!="0"){b_.B108.setBackgroundResource(R.drawable.gray)};if(b_.B109.text!="0"){b_.B109.setBackgroundResource(R.drawable.gray)};if(b_.B110.text!="0"){b_.B110.setBackgroundResource(R.drawable.gray)};
        if(b_.B111.text!="0"){b_.B111.setBackgroundResource(R.drawable.gray)};if(b_.B112.text!="0"){b_.B112.setBackgroundResource(R.drawable.gray)};if(b_.B113.text!="0"){b_.B113.setBackgroundResource(R.drawable.gray)};if(b_.B114.text!="0"){b_.B114.setBackgroundResource(R.drawable.gray)};if(b_.B115.text!="0"){b_.B115.setBackgroundResource(R.drawable.gray)};if(b_.B116.text!="0"){b_.B116.setBackgroundResource(R.drawable.gray)};if(b_.B117.text!="0"){b_.B117.setBackgroundResource(R.drawable.gray)};if(b_.B118.text!="0"){b_.B118.setBackgroundResource(R.drawable.gray)};if(b_.B119.text!="0"){b_.B119.setBackgroundResource(R.drawable.gray)};if(b_.B120.text!="0"){b_.B120.setBackgroundResource(R.drawable.gray)};
        if(b_.B121.text!="0"){b_.B121.setBackgroundResource(R.drawable.gray)};if(b_.B122.text!="0"){b_.B122.setBackgroundResource(R.drawable.gray)};if(b_.B123.text!="0"){b_.B123.setBackgroundResource(R.drawable.gray)};if(b_.B124.text!="0"){b_.B124.setBackgroundResource(R.drawable.gray)};if(b_.B125.text!="0"){b_.B125.setBackgroundResource(R.drawable.gray)};if(b_.B126.text!="0"){b_.B126.setBackgroundResource(R.drawable.gray)};if(b_.B127.text!="0"){b_.B127.setBackgroundResource(R.drawable.gray)};if(b_.B128.text!="0"){b_.B128.setBackgroundResource(R.drawable.gray)};if(b_.B129.text!="0"){b_.B129.setBackgroundResource(R.drawable.gray)};if(b_.B130.text!="0"){b_.B130.setBackgroundResource(R.drawable.gray)};
        if(b_.B131.text!="0"){b_.B131.setBackgroundResource(R.drawable.gray)};if(b_.B132.text!="0"){b_.B132.setBackgroundResource(R.drawable.gray)};if(b_.B133.text!="0"){b_.B133.setBackgroundResource(R.drawable.gray)};if(b_.B134.text!="0"){b_.B134.setBackgroundResource(R.drawable.gray)};if(b_.B135.text!="0"){b_.B135.setBackgroundResource(R.drawable.gray)};if(b_.B136.text!="0"){b_.B136.setBackgroundResource(R.drawable.gray)};if(b_.B137.text!="0"){b_.B137.setBackgroundResource(R.drawable.gray)};if(b_.B138.text!="0"){b_.B138.setBackgroundResource(R.drawable.gray)};if(b_.B139.text!="0"){b_.B139.setBackgroundResource(R.drawable.gray)};if(b_.B140.text!="0"){b_.B140.setBackgroundResource(R.drawable.gray)};
        if(b_.B141.text!="0"){b_.B141.setBackgroundResource(R.drawable.gray)};if(b_.B142.text!="0"){b_.B142.setBackgroundResource(R.drawable.gray)};if(b_.B143.text!="0"){b_.B143.setBackgroundResource(R.drawable.gray)};if(b_.B144.text!="0"){b_.B144.setBackgroundResource(R.drawable.gray)};if(b_.B145.text!="0"){b_.B145.setBackgroundResource(R.drawable.gray)};if(b_.B146.text!="0"){b_.B146.setBackgroundResource(R.drawable.gray)};if(b_.B147.text!="0"){b_.B147.setBackgroundResource(R.drawable.gray)};if(b_.B148.text!="0"){b_.B149.setBackgroundResource(R.drawable.gray)};if(b_.B150.text!="0"){b_.B150.setBackgroundResource(R.drawable.gray)};if(b_.B141.text!="0"){b_.B141.setBackgroundResource(R.drawable.gray)};

    }
    var points =0
    private fun landing(){
        if(num1==141||num1==142||num1==143||num1==144||num1==145||num1==146||num1==147||num1==148||num1==149||num1==150||
            num2==141||num2==142||num2==143||num2==144||num2==145||num2==146||num2==147||num2==148||num2==149||num2==150||
            num3==141||num3==142||num3==143||num3==144||num3==145||num3==146||num3==147||num3==148||num3==149||num3==150||
            num4==141||num4==142||num4==143||num4==144||num4==145||num4==146||num4==147||num4==148||num4==149||num4==150) {array[0].text=="0";array[1].text=="0";array[2].text=="0";array[3].text=="0";array[4].text=="0";}
        if (array[0].text=="1"||array[1].text=="1"||array[2].text=="1"||array[3].text=="1"){array[0].text=="0";array[1].text=="0";array[2].text=="0";array[3].text=="0"}

    }
    private fun colors(){

        R_L()
        a=0;b=0

        arrayCollectionPreviousOne[0].setBackgroundResource(R.drawable.gray);arrayCollectionPreviousOne[1].setBackgroundResource(R.drawable.gray)
        arrayCollectionPreviousOne[2].setBackgroundResource(R.drawable.gray);arrayCollectionPreviousOne[3].setBackgroundResource(R.drawable.gray)
        when(shape_is)
        {
            1 -> {array[0].setBackgroundResource(R.drawable.red_block);array[1].setBackgroundResource(R.drawable.red_block);array[2].setBackgroundResource(R.drawable.red_block);array[3].setBackgroundResource(R.drawable.red_block);}
            2 -> {array[0].setBackgroundResource(R.drawable.orange_block);array[1].setBackgroundResource(R.drawable.orange_block);array[2].setBackgroundResource(R.drawable.orange_block);array[3].setBackgroundResource(R.drawable.orange_block);}
            3 -> {array[0].setBackgroundResource(R.drawable.yellow_block);array[1].setBackgroundResource(R.drawable.yellow_block);array[2].setBackgroundResource(R.drawable.yellow_block);array[3].setBackgroundResource(R.drawable.yellow_block);}
            4 -> {array[0].setBackgroundResource(R.drawable.green_block);array[1].setBackgroundResource(R.drawable.green_block);array[2].setBackgroundResource(R.drawable.green_block);array[3].setBackgroundResource(R.drawable.green_block);}
            5 -> {array[0].setBackgroundResource(R.drawable.blue_block);array[1].setBackgroundResource(R.drawable.blue_block);array[2].setBackgroundResource(R.drawable.blue_block);array[3].setBackgroundResource(R.drawable.blue_block);}
            6 -> {array[0].setBackgroundResource(R.drawable.purple_block);array[1].setBackgroundResource(R.drawable.purple_block);array[2].setBackgroundResource(R.drawable.purple_block);array[3].setBackgroundResource(R.drawable.purple_block);}
            7 -> {array[0].setBackgroundResource(R.drawable.pink_block);array[1].setBackgroundResource(R.drawable.pink_block);array[2].setBackgroundResource(R.drawable.pink_block);array[3].setBackgroundResource(R.drawable.pink_block);}

        }

        if(array[0].text.toString()=="0" && array[1].text.toString()=="0" && array[2].text.toString()=="0" && array[3].text.toString()=="0"){
            points+=15;list2()}
        else{array.removeAll(array);arrayCollectionPreviousOne.removeAll(arrayCollectionPreviousOne);Handler().postDelayed({list()},600)}

    }
}
