package paulo.antonio.projetocestafeira.model

import android.widget.ImageView

data class Produtos (
    //var imagem: ImageView,
    var nomeProduto: String,
    var categoria: String,
    var pesoGrama: Double,
    var valorGrama: Double,
    var descricao: String,
    var organico: Boolean){

}