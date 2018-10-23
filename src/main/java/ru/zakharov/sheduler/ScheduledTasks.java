package ru.zakharov.sheduler;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.zakharov.nmapparser.Nmap;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private Nmap nmap;

    public void setNmap(Nmap nmap) {
        this.nmap = nmap;
    }

    //@Scheduled(fixedRate = 60000)
    public void doScan() {
        log.info("The time is now {}", dateFormat.format(new Date()));
        nmap.doScan();
    }

    //@Scheduled(fixedRate = 60000)
    public void parseScanResults() {
        log.info("The time is now {}", dateFormat.format(new Date()));
        nmap.parse();
    }
}
