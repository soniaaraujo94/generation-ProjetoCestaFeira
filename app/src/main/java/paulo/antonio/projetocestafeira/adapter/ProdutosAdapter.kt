package paulo.antonio.projetocestafeira.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import paulo.antonio.projetocestafeira.R
import paulo.antonio.projetocestafeira.databinding.CardLayoutBinding
import paulo.antonio.projetocestafeira.model.Produtos

class ProdutosAdapter : RecyclerView.Adapter<ProdutosAdapter.ProdutosViewHolder>() {

    var listProduto = emptyList<Produtos>()

    class ProdutosViewHolder (val binding: CardLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutosViewHolder {
        return ProdutosViewHolder(CardLayoutBinding.inflate
            (LayoutInflater.from(parent.context), parent, false
        ))
    }

    override fun onBindViewHolder(holder: ProdutosViewHolder, position: Int) {
        val produto = listProduto[position]

        holder.binding.imageProdcut.setImageResource(R.drawable.orange_png806_2)
        holder.binding.textNome.text = produto.nomeProduto
        holder.binding.textValor.text = produto.valorGrama.toString()
    }

    override fun getItemCount(): Int {
        return listProduto.size
    }

    fun setList(list: List<Produtos>){
        listProduto = list
        notifyDataSetChanged()

    }

}