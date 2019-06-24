package br.com.digitalhouse.digitalhousegroceryapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.digitalhousegroceryapp.adapter.ProdutoAdapter;
import br.com.digitalhouse.digitalhousegroceryapp.model.Produto;


/**
 * A simple {@link Fragment} subclass.
 */
public class ComprasFragment extends Fragment {


    public ComprasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);

        List<Produto> listaProdutos = getListaProdutos();

        ProdutoAdapter produtoAdapter = new ProdutoAdapter(listaProdutos);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(view.getContext());

        RecyclerView recyclerView = view.findViewById(R.id.produtos_recycler_view);
        recyclerView.setAdapter(produtoAdapter);
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }

    private List<Produto> getListaProdutos (){
        List<Produto> listaProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Cebola",2,"kg",false);
        listaProdutos.add(produto1);

        Produto produto2 = new Produto("Arroz",5,"kg",false);
        listaProdutos.add(produto2);

        Produto produto3 = new Produto("Bolacha",2,"un",false);
        listaProdutos.add(produto3);

        Produto produto4 = new Produto("Batata",1,"kg",true);
        listaProdutos.add(produto4);

        Produto produto5 = new Produto("Papel Higiênico",2,"un",false);
        listaProdutos.add(produto5);

        return listaProdutos;
    }

}
