package com.stomas.chatfinal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stomas.chatfinal.R;
import java.util.ArrayList;
import java.util.List;

public class ContactsFragment extends Fragment {
    private RecyclerView recyclerViewContacts;
    private Button buttonAddContact;
    private ContactsAdapter contactsAdapter;
    private List<Contact> contactList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contacts, container, false);
        recyclerViewContacts = view.findViewById(R.id.recyclerViewContacts);
        buttonAddContact = view.findViewById(R.id.buttonAddContact);

        // Inicializar la lista de contactos
        contactList = new ArrayList<>();
        contactsAdapter = new ContactsAdapter(contactList);
        recyclerViewContacts.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewContacts.setAdapter(contactsAdapter);

        // Cargar contactos (esto puede ser desde Firebase o una base de datos local)
        loadContacts();

        buttonAddContact.setOnClickListener(v -> {
            // Lógica para agregar un nuevo contacto
            Toast.makeText(getContext(), "Agregar contacto", Toast.LENGTH_SHORT).show();
        });

        return view;
    }

    private void loadContacts() {
        // Aquí puedes cargar los contactos desde Firebase o cualquier otra fuente
        // Por ejemplo, agregar algunos contactos de ejemplo
        contactList.add(new Contact("1", "Juan Pérez", "juan@example.com"));
        contactList.add(new Contact("2", "María López", "maria@example.com"));
        contactList.add(new Contact("3", "Carlos García", "carlos@example.com"));

        // Notificar al adaptador que los datos han cambiado
        contactsAdapter.notifyDataSetChanged();
    }
}