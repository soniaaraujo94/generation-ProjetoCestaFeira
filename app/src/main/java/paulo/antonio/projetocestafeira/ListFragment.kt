package paulo.antonio.projetocestafeira

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import paulo.antonio.projetocestafeira.adapter.ProdutosAdapter
import paulo.antonio.projetocestafeira.databinding.FragmentListBinding
import paulo.antonio.projetocestafeira.model.Produtos

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentListBinding.inflate(layoutInflater, container, false)

               val listProdutos = listOf(
            Produtos(
                "Laranja",
                "Frutas",
                100.0,
                4.99,
                "A vitamina C encontrada na laranja tem ação antioxidante. " +
                        "Auxilia na produção de" +
                        "colágeno, deixando a pele livre rugas.",
                true),
            Produtos(
                "Cenoura",
                "Legumes",
                100.0,
                4.99,
                "Elas contêm uma substância chamada beta caroteno, " +
                        "que se transforma em vitamina A no organismo.",
                false),
            Produtos(
                "Brocólis",
                "Verduras",
                100.0,
                4.99,
                "O consumo regular contribui com o controle de açúcar no sangue, " +
                        "reduz inflamações, faz bem para o coração e aumenta a imunidade",
                true)
               )

        val adapter = ProdutosAdapter()

        binding.recycleProdutos.adapter = adapter
        binding.recycleProdutos.layoutManager = GridLayoutManager(context, 2)
        binding.recycleProdutos.setHasFixedSize(true)

        adapter.setList(listProdutos)
/*
        binding.floatingButton.setOnClickListener{
            findNavController().navigate(R.id.action_listFragment_to_descricaoFragment)
        }
*/
        return binding.root
    }
}