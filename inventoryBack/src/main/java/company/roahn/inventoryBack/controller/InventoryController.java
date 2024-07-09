package company.roahn.inventoryBack.controller;

import company.roahn.inventoryBack.models.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/api/inventario")
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;

    @PostMapping("/update")
    public void updateInventario(@RequestBody Inventory inventory) {
        inventarioService.updateInventario(inventory);
        notifyInventarioChange(inventory);
    }

    @MessageMapping("/updateInventory")
    @SendTo("/topic/inventory")
    public Inventory notifyInventarioChange(Inventory inventory) {
        return inventory;
    }
}