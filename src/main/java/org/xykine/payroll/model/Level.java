package org.xykine.payroll.model;

public record Level(
                    Long levelID,
                    String levelCode,
                    String levelName,
                    String createdDate,
                    String lastModifiedDate,
                    String createdBy,
                    String lastModifiedBy,
                    int version
) {
    public static Level of(
            String levelCode,
            String levelName
    ) {
        return new Level(
                null,
                levelCode,
                levelName,
                null, null, null, null, 0
        );
    }
}
