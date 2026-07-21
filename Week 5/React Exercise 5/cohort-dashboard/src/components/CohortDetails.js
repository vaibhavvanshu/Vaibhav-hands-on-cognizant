import styles from "./CohortDetails.module.css";

function CohortDetails({ cohort }) {

    return (
        <div className={styles.box}>

            <h3
                style={{
                    color:
                        cohort.status === "ongoing"
                            ? "green"
                            : "blue"
                }}
            >
                {cohort.name}
            </h3>

            <dl>
                <dt>Technology</dt>
                <dd>{cohort.technology}</dd>

                <dt>Trainer</dt>
                <dd>{cohort.trainer}</dd>

                <dt>Current Status</dt>
                <dd>{cohort.status}</dd>

                <dt>Start Date</dt>
                <dd>{cohort.startDate}</dd>

                <dt>Coach</dt>
                <dd>{cohort.coach}</dd>
            </dl>

        </div>
    );
}

export default CohortDetails;