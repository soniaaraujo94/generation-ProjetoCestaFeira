package paulo.antonio.projetocestafeira

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import paulo.antonio.projetocestafeira.databinding.ActivityMainBinding
import paulo.antonio.projetocestafeira.databinding.CardLayoutBinding
import paulo.antonio.projetocestafeira.databinding.FragmentDescricaoBinding
import paulo.antonio.projetocestafeira.databinding.FragmentFormBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}