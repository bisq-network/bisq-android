package bisq.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bisq.android.bisq_android.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
