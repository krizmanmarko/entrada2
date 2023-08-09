package nl.sidn.entrada2.worker.enrich.geoip;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.net.InetAddress;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.maxmind.geoip2.model.CountryResponse;
import nl.sidn.entrada2.worker.service.enrich.geoip.GeoIPService;
import nl.sidn.entrada2.worker.service.enrich.geoip.MaxmindClient;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class GeoIpTest {
  
  @Autowired 
  private GeoIPService geo;
  
//  @Autowired MaxmindClient mmClient;
//  
//  @Value("${maxmind.license.paid}")
//  private String license;
//  
//  @Test
//  public void testClient() throws Exception{
//    String url = "https://download.maxmind.com/app/geoip_download?edition_id=GeoIP2-Country&suffix=tar.gz&license_key=" + license;
//      ResponseEntity e = mmClient.getDatabase(url);
//      assertNotNull(e);
//    
//  }
  
//  @Test
//  public void testLoadGeoIpDatabases() throws Exception{
//        
//    assertNotNull(geo.getGeoReader());
//    assertNotNull(geo.getAsnReader());
//
//    
//    Optional<CountryResponse> oc = geo.lookupCountry(InetAddress.getByName("www.sidn.nl"));
//    assertTrue(oc.isPresent());
//  }

}