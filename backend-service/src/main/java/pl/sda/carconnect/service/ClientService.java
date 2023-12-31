package pl.sda.carconnect.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.sda.carconnect.domain.Client;
import pl.sda.carconnect.repository.ClientRepository;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;

    public Client findClientById(Long aLong) {
        return clientRepository.findClientById(aLong);
    }

    public List<Client> findAllClients() {
        return clientRepository.findAllClients();
    }

    public Client addClient(Client client) {
        return clientRepository.addClient(client);
    }
}
