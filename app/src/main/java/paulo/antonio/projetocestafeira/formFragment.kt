package paulo.antonio.projetocestafeira

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import paulo.antonio.projetocestafeira.databinding.FragmentFormBinding

class formFragment : Fragment() {

    private lateinit var binding: FragmentFormBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentFormBinding.inflate(layoutInflater, container, false)

        binding.btnAdicionarProduto.setOnClickListener{
            findNavController().navigate(R.id.action_listFragment_to_formFragment)

        }

        return binding.root
}

}