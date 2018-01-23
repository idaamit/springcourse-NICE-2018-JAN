package qualifier_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {
    @Autowired
    private Dao mainDao;
    @Autowired
    private Dao backupDao;

    @Scheduled(cron = "1/1 * * * * ?")
    public void doWork() {
        mainDao.save();
    }

    @Scheduled(cron = "1/3 * * * * ?")
    public void doBackup() {
        backupDao.save();
    }
}





