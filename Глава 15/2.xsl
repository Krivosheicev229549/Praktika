<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h2>Tourist Vouchers</h2>
                <table border="1">
                    <tr>
                        <th>Type</th>
                        <th>Country</th>
                        <th>Duration</th>
                        <th>Transport</th>
                        <th>Hotel Stars</th>
                        <th>Food</th>
                        <th>Room type</th>
                        <th>TV</th>
                        <th>Air conditioner</th>
                        <th>Cost</th>
                    </tr>
                    <xsl:for-each select="Tourist_voucher/Voucher">
                        <tr>
                            <td><xsl:value-of select="Type"/></td>
                            <td><xsl:value-of select="Country"/></td>
                            <td><xsl:value-of select="Number_days_nights"/></td>
                            <td><xsl:value-of select="Transport"/></td>
                            <td><xsl:value-of select="Hotel_characteristic/Stars"/></td>
                            <td><xsl:value-of select="Hotel_characteristic/Food"/></td>
                            <td><xsl:value-of select="Hotel_characteristic/Room"/></td>
                            <td><xsl:value-of select="Hotel_characteristic/TV"/></td>
                            <td><xsl:value-of select="Hotel_characteristic/Air_conditioner"/></td>
                            <td><xsl:value-of select="Cost"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>