package yyn9704kr.kro.kr.SpringWeblog.Entity;

import com.mysql.jdbc.Blob;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.awt.*;

@Entity
@Getter
@Setter
public class Character {

    @Id
    @GeneratedValue
    private int charaId;

    //이름
    private String charaName;
    private String charaNick;

    //구분
    @Enumerated(EnumType.STRING)
    private CharaType charaType;

    //테마색
    private String charaColor;

    //설정
    private String charaBirthday;
    private String charaLike;
    private String charaHate;

    //설명
    private String charaDesc;

    //이미지
    private Byte[] charaThumbnail;
    private String charaStanding;

//    public class PersonPhotoTest {
//        private static ServiceRegistry serviceRegistry;
//        private static Session session;
//
//        public static void main(String[] args) throws IOException {
//            initSession();
//
//            String photoFilePathToRead = "e:/Test/Photo/Puppy.jpg";
//            savePersonWithPhoto(photoFilePathToRead);
//
//            int personId = 1;
//            String photoFilePathToSave = "e:/Test/Photo/MyPuppy.jpg";
//            readPhotoOfPerson(personId, photoFilePathToSave);
//
//            endSession();
//        }
//
//        private static void savePersonWithPhoto(String photoFilePath) throws IOException {
//            Person person = new Person("Tom");
//            byte[] photoBytes = readBytesFromFile(photoFilePath);
//            person.setPhoto(photoBytes);
//            session.save(person);
//        }
//
//        private static void readPhotoOfPerson(int personId, String photoFilePath) throws IOException {
//            Person person = (Person) session.get(Person.class, personId);
//            byte[] photoBytes = person.getPhoto();
//            saveBytesToFile(photoFilePath, photoBytes);
//        }
//
//        private static byte[] readBytesFromFile(String filePath) throws IOException {
//            File inputFile = new File(filePath);
//            FileInputStream inputStream = new FileInputStream(inputFile);
//
//            byte[] fileBytes = new byte[(int) inputFile.length()];
//            inputStream.read(fileBytes);
//            inputStream.close();
//
//            return fileBytes;
//        }
//
//        private static void saveBytesToFile(String filePath, byte[] fileBytes) throws IOException {
//            FileOutputStream outputStream = new FileOutputStream(filePath);
//            outputStream.write(fileBytes);
//            outputStream.close();
//        }
//
//
//        private static void initSession() {
//            Configuration configuration = new Configuration().configure();
//            serviceRegistry = new StandardServiceRegistryBuilder()
//                    .applySettings(configuration.getProperties()).build();
//
//            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//
//            session = sessionFactory.openSession();
//            session.beginTransaction();
//        }
//
//        private static void endSession() {
//            session.getTransaction().commit();
//            session.close();
//
//            StandardServiceRegistryBuilder.destroy(serviceRegistry);
//        }
//
//    }

}
