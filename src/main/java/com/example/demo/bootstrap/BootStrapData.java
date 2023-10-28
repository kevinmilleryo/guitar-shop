package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

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

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        if (partRepository.count() == 0 && productRepository.count()==0) {
            OutsourcedPart body = new OutsourcedPart();
            body.setCompanyName("Great Guitar Bodies");
            body.setName("Guitar Body");
            body.setInv(10);
            body.setPrice(100.0);
            body.setMax(50);
            body.setMin(5);
//            body.setId(100L);
            outsourcedPartRepository.save(body);

            OutsourcedPart neck = new OutsourcedPart();
            neck.setCompanyName("Great Necks");
            neck.setName("Guitar Neck");
            neck.setInv(10);
            neck.setPrice(40.0);
            neck.setMax(75);
            neck.setMin(10);
//            neck.setId(100L);
            outsourcedPartRepository.save(neck);

            OutsourcedPart tuner = new OutsourcedPart();
            tuner.setCompanyName("Tuner's R Us");
            tuner.setName("Guitar Tuner");
            tuner.setInv(8);
            tuner.setPrice(20.0);
            tuner.setMax(50);
            tuner.setMin(10);
//            tuner.setId(100L);
            outsourcedPartRepository.save(tuner);

            OutsourcedPart bridge = new OutsourcedPart();
            bridge.setCompanyName("A guitar bridge too far");
            bridge.setName("Guitar Bridge");
            bridge.setInv(5);
            bridge.setPrice(25.0);
            bridge.setMax(25);
            bridge.setMin(5);
//            bridge.setId(100L);
            outsourcedPartRepository.save(bridge);

            OutsourcedPart strings = new OutsourcedPart();
            strings.setCompanyName("Stringing Along");
            strings.setName("Guitar Strings");
            strings.setInv(5);
            strings.setPrice(20.0);
            strings.setMax(15);
            strings.setMin(5);
//            strings.setId(100L);
            outsourcedPartRepository.save(strings);

//            OutsourcedPart thePart = null;
//            List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
//            for (OutsourcedPart part : outsourcedParts) {
//                if (part.getName().equals("out test")) thePart = part;
//            }

//            System.out.println(thePart.getCompanyName());

            List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */


            Product lespaul = new Product("lespaul", 1000.0, 15);
            Product sg = new Product("sg", 600.0, 15);
            Product stratocaster = new Product("stratocaster", 800.0, 10);
            Product telecaster = new Product("telecaster", 750.0, 8);
            Product kidsModel = new Product("Kid's Model", 200.0, 20);
            productRepository.save(lespaul);
            productRepository.save(sg);
            productRepository.save(stratocaster);
            productRepository.save(telecaster);
            productRepository.save(kidsModel);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
