package company.roahn.inventoryBack.controller;

import company.roahn.inventoryBack.dto.InventoryDTO;
import company.roahn.inventoryBack.models.Inventory;
import company.roahn.inventoryBack.service.IInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.modelmapper.ModelMapper;


@Controller
@RequestMapping("/api/inventories")
public class InventoryController {

    @Autowired
    private IInventoryService service;

    @Autowired
    private ModelMapper  mapper;

    @PostMapping("/update")
    public void updateInventory(@RequestBody InventoryDTO inventory) {
        notifyInventoryChange(inventory);
    }

    @MessageMapping("/updateInventory")
    @SendTo("/topic/inventory")
    public InventoryDTO notifyInventoryChange(InventoryDTO inventoryDTO) {
        Inventory inventory = mapper.map(inventoryDTO,Inventory.class);
        Inventory updateInventory=service.update(inventory);
        return mapper.map(updateInventory,InventoryDTO.class);
    }

    public void setMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }
}