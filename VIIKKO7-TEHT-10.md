Viikko 7, tehtävä 10, referaatti: Ohjelmistoarkkitehtuurin
sisällyttäminen ketteriin ohjelmistotuotantomenetelmiin

Oppikirjan mukaisissa ketteriä menetelmiä soveltavissa ohjelmistoprojekteissa ei ole luontaista tilaa tai aikaa varattu ohjelmistoarkktehtuurin suunnitteluun. Monet yritykset pitävät tätä perusteltuna puutteena ja ovat kehittäneet erilaisia lähestymistapoja, jotka paremmin huomioivat ohjelmistoarkkitehtuuriin liittyviä haasteita. Tero Huomo kandityössään tarkastelee lähemmin viittä tällaista käytäntöä.

Perusmuodossaan ketterät menetelmät lähtevät siitä, että arkkitehtuuri muodostuu itsekseen, kun koodia refaktoroidaan samalla kun ohjelmaan laajennetaan ja mukaudutaan asiakkaan muuttuviin tarpeisiin. Esimerkki tyypillisestä ongelmasta on, että jotkut arkktehtuurit eivät skaalaudu kunnolla, kun ohjelman käyttäjämäärät esim. verkossa kasvavat.

D. Rawsthorne esitteli vuonna 2007 käsitteen Sprint 0. Se on projektin aloitustoimiin suunnattu pyrähdys ennen varsinaisia kehitysjaksoja. Architech Solutionsin toisenlaisessa näkökulmassa Sprint 0 voidaan suunnata etukäteen suoritettavaan järjestelmän rakenteen suunnitteluun. Sprint 0:ssa luodaan
korkean tason suunnitelma ohjelmiston arkkitehtuurista. Tähän varataan koko sprintti, 2-4 viikkoa ja työn tekee sama ryhmä kuin muutkin sprintit. Jaksossa käytetään aikaa myös esimerkiksi entuudestaan tuntemattoman laitteiston vaatimusten
ja rajoitusten kartoittamiseen. Lean-ohjelmistotuotantoa hyödyntäneessä MSLite-projektissa varhainen arkkitehtuurisuunnitelma oli tapa koordinoida järjestelmän osien kehitys useille projektiryhmille.

Srumin kehittäjä Ken Schwaber pitää Sprint 0:aa vain keinona viivästyttää projektin alkamista.

Eräs tapa käsitellä arkkitehtuuria on erillinen rinnakkainen prosessi josta vastaa yrityksen arkkitehtuuriryhmä. Jotkut arkkitehdeistä ovat mukana kehitysryhmässä varmistamassa tiedonkulkua. Sopivissa tarkistuspisteissä arkkitehdit voivat demonstroida suunnitelmansa esim. prototyyppien avulla. Prototyyppi ei liity suoraan tekeillä olevan sprintin käyttäjätarinoihin. Arkkitehdin työ voi olla esim. 1-2 sprinttiä edellä varsinaista sprintin työtä.

Ketteristä menetelmistä Extreme Programming hyväksyy ns. suunnittelupiikit osaksi sprinttiä. Muutama kokenut ohjelmoija käyttää 1-2 viikkoa ohjelman laajentmiseen liittyvien haasteden selvittämiseen. Voidaan myös määritellä erityisiä arkkitehtuuritarinoita backlogiin.

Joissakin yrityksissä on käytössä aika ajoin ns. Team sprint, jolloin asiakas ei priorisoi vaatimuslistaa vaan antaa tiimin tehdä sen. Nämä jaksot antavat tilaa kehitystiimin luovuudelle ja innovaatioille. Niitä voidaan käyttää myös sellaisiin tärkeisiin aiheisiin kuten arkkitehtuuriratkaisujen selvittäiseen, jotka muutoin jäisivät tekemättä.

Oma näkemys on, että ketterät menetelmät ovat pohjimmiltaan pelkkä kehys, ei pitäisi olla mikään ongelma sisällyttää siihen erillisiä arkkitehtuurivaiheita tai tarinoita, jos ne muutoin ovat hyvin perustetuja.
