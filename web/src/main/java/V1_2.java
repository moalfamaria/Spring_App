import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;
import java.sql.PreparedStatement;
public class V1_2 extends BaseJavaMigration {
    public void migrate(Context context) throws Exception {
        try (PreparedStatement statement =
                     context
                             .getConnection()
                             .prepareStatement("INSERT INTO V1_create_users (name) VALUES ('Obelix')")) {
            statement.execute();
        }
    }
}
