package com.gmail.criptotoapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_coin_detail.*

class CoinDetailActivity : AppCompatActivity() {
    private lateinit var viewModel: CoinViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_detail)
        if (!intent.hasExtra(EXTRA_FROM_SYMBOL)){
            finish()
            return
        }
        val fromSymbol = intent.getStringExtra(EXTRA_FROM_SYMBOL)
        //присваиваем значение
        viewModel = ViewModelProviders.of(this).get(CoinViewModel::class.java)
        //получаем детальную информацию
        viewModel.getDetailInfo(fromSymbol).observe(this, Observer {
            tvPriceLabel.text = it.price
            tvMinPriceLabel.text = it.lowDay
            tvMaxPriceLabel.text = it.highDay
            tvLastPriceLabel.text = it.lastMarket
            tvUpdateLabel.text = it.getFormatedTime()
            tvFromSymbol.text = it.fromSymbol
            tvToSymbol.text = it.toSymbol
            Picasso.get().load(it.getFullImageUrl()).into(ivLogo)
        })
    }
    companion object{
       private const val EXTRA_FROM_SYMBOL = "fSym"
        fun newIntent(context: Context,fromSymbol: String): Intent{
            val intent = Intent(context, CoinDetailActivity::class.java)
            intent.putExtra(EXTRA_FROM_SYMBOL, fromSymbol)
            return intent
        }
    }
}
