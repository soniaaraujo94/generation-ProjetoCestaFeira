package paulo.antonio.projetocestafeira

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import paulo.antonio.projetocestafeira.databinding.FragmentDescricaoBinding
import paulo.antonio.projetocestafeira.databinding.FragmentFormBinding


class descricaoFragment : Fragment() {

    private lateinit var binding: FragmentDescricaoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentDescricaoBinding.inflate(layoutInflater, container, false)

        binding.toolbar.setOnClickListener{
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }

        return binding.root
    }

}