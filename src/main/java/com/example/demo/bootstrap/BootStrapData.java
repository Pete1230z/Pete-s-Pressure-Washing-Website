package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final InhousePartRepository inhousePartRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, InhousePartRepository inhousePartRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.inhousePartRepository = inhousePartRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<InhousePart> inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();

        InhousePart part1 = new InhousePart();
        part1.setId(1);
        part1.setName("Shooter Tips");
        part1.setInv(10);
        part1.setMin(1);
        part1.setMax(50);
        part1.setPrice(50.0);
        inhousePartRepository.save(part1);
        inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();
        InhousePart thePart = null;
        for (InhousePart part : inhouseParts) {
            if (part.getName().equals("Shooter Tip")) {
                thePart = part;
                break;
            }
        }

        if (thePart != null) {
            System.out.println(thePart.getName());
        } else {
            System.out.println("Part not found");
        }

        InhousePart part2 = new InhousePart();
        part2.setId(2);
        part2.setName("Washing Hose");
        part2.setInv(20);
        part2.setMin(1);
        part2.setMax(50);
        part2.setPrice(30.0);
        inhousePartRepository.save(part2);
        inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();
        thePart = null;
        for (InhousePart part : inhouseParts) {
            if (part.getName().equals("Washing Hose")) {
                thePart = part;
                break;
            }
        }

        if (thePart != null) {
            System.out.println(thePart.getName());
        } else {
            System.out.println("Part not found");
        }

        inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();
        for (InhousePart part : inhouseParts) {
            System.out.println(part.getName() + " " + part.getId());
        }

        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();

        OutsourcedPart part3 = new OutsourcedPart();
        part3.setCompanyName("Amazon");
        part3.setId(3);
        part3.setName("Surface Cleaner");
        part3.setInv(5);
        part3.setMin(1);
        part3.setMax(50);
        part3.setPrice(100.0);
        outsourcedPartRepository.save(part3);
        //Update list after saving the new part
        outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        OutsourcedPart theOutPart = null;
        for (OutsourcedPart part : outsourcedParts) {
            if (part.getName().equals("Surface Cleaner")) {
                theOutPart = part;
                break;
            }
        }

        if (theOutPart != null) {
            System.out.println(theOutPart.getName());
        } else {
            System.out.println("Part not found");
        }

        OutsourcedPart part4 = new OutsourcedPart();
        part4.setCompanyName("Lowes");
        part4.setId(4);
        part4.setName("Wonder Wand");
        part4.setInv(25);
        part4.setMin(1);
        part4.setMax(50);
        part4.setPrice(50.0);
        outsourcedPartRepository.save(part4);
        //Update list after saving the new part
        outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        theOutPart = null;
        for (OutsourcedPart part : outsourcedParts) {
            if (part.getName().equals("Wonder Wand")) {
                theOutPart = part;
                break;
            }
        }

        if (theOutPart != null) {
            System.out.println(theOutPart.getName());
        } else {
            System.out.println("Part not found");
        }

        OutsourcedPart part5 = new OutsourcedPart();
        part5.setCompanyName("Home Depot");
        part5.setId(5);
        part5.setName("Pressure Valve");
        part5.setInv(20);
        part5.setMin(1);
        part5.setMax(50);
        part5.setPrice(15.0);
        outsourcedPartRepository.save(part5);
        outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        theOutPart = null;
        for (OutsourcedPart part : outsourcedParts) {
            if (part.getName().equals("Pressure Valve")) {
                theOutPart = part;
                break;
            }
        }

        if (theOutPart != null) {
            System.out.println(thePart.getName());
        } else {
            System.out.println("Part not found");
        }

        /*inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();
        for (InhousePart part : inhouseParts) {
            System.out.println(part.getName() + " " + part.getId());
        }*/

        /*List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for (OutsourcedPart part : outsourcedParts) {
            System.out.println(part.getName() + " " + part.getCompanyName());
        }*/
    }
}
