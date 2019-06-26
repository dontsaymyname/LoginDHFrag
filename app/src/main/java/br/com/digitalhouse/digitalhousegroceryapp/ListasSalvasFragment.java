package br.com.digitalhouse.digitalhousegroceryapp;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.digitalhousegroceryapp.adapter.ListaSalvaAdapter;
import br.com.digitalhouse.digitalhousegroceryapp.interfaces.FragmentActionListener;
import br.com.digitalhouse.digitalhousegroceryapp.interfaces.ListaComprasListener;
import br.com.digitalhouse.digitalhousegroceryapp.model.ListaCompras;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListasSalvasFragment extends Fragment implements ListaComprasListener {

    private RecyclerView recyclerView;
    private FragmentActionListener fragmentActionListener;

    public ListasSalvasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);

        recyclerView = view.findViewById(R.id.lista_salva_recycler_view);

        ListaSalvaAdapter listaSalvaAdapter = new ListaSalvaAdapter(getListaComprasList(), this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setAdapter(listaSalvaAdapter);

        recyclerView.setLayoutManager(layoutManager);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        fragmentActionListener = (FragmentActionListener) context;
    }

    private List<ListaCompras> getListaComprasList(){

        List<ListaCompras> listaComprasList = new ArrayList<>();

        ListaCompras listaCompras1 = new ListaCompras();
        listaCompras1.setNome("Compras Super Mercado");
        listaComprasList.add(listaCompras1);

        ListaCompras listaCompras2 = new ListaCompras();
        listaCompras2.setNome("Compras Churrasco fds");
        listaComprasList.add(listaCompras2);

        ListaCompras listaCompras3 = new ListaCompras();
        listaCompras3.setNome("Compras Açougue");
        listaComprasList.add(listaCompras3);

        ListaCompras listaCompras4 = new ListaCompras();
        listaCompras4.setNome("Compras Feira");
        listaComprasList.add(listaCompras4);

        return listaComprasList;

    }

    @Override
    public void onListaComprasClicado(ListaCompras listaCompras) {
        Fragment comprasFragment = new ComprasFragment();
        fragmentActionListener.substituirFragmente(comprasFragment);
        Toast.makeText(getActivity(), "Lista Selecionada: " + listaCompras.getNome(), Toast.LENGTH_SHORT).show();
    }
}
