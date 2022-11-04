package stringbuilder;

/**
 * @author 叶嘉卫
 * @date 2022/10/26/19:56
 * @Description:   stringbuilder练习
 */
public class test {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");

    }
    static String buildInsertSql(String table, String[] fields) {

        StringBuilder s1 = new StringBuilder();
        s1.append("INSERT INTO ")
                .append(table)
                .append(" (");

        for (int i = 0; i < fields.length; i++) {
           if(i== fields.length-1){
               s1.append(fields[i])
                       .append(") VALUES (?, ?, ?)");
           }else {
               s1.append(fields[i])
                       .append(", ");
           }
        }



        return s1.toString();
    }
}
